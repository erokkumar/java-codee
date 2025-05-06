package Project;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GhibliStyleImage {
    private static final String API_URL = "https://api-inference.huggingface.co/models/stabilityai/stable-diffusion-2";
    private static final String API_TOKEN = "YOUR_HUGGINGFACE_API_KEY"; // Replace with your Hugging Face API key

    public static void main(String[] args) {
        String inputImagePath = "input.jpg";  // Path to input image
        String outputImagePath = "ghibli_output.png"; // Output file

        try {
            // Read image
            File imageFile = new File(inputImagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found!");
                return;
            }

            // Convert image to byte array
            byte[] imageBytes = Files.readAllBytes(Paths.get(inputImagePath));

            // Call API to process the image
            byte[] resultImageBytes = generateGhibliStyle(imageBytes);

            // Save the output image
            if (resultImageBytes != null) {
                Files.write(Paths.get(outputImagePath), resultImageBytes);
                System.out.println("Ghibli-style image saved as " + outputImagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] generateGhibliStyle(byte[] imageBytes) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + API_TOKEN);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // JSON payload for Stable Diffusion API
            String jsonPayload = "{ \"inputs\": \"a Ghibli-style illustration\", \"image\": \"" +
                    java.util.Base64.getEncoder().encodeToString(imageBytes) + "\" }";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonPayload.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read response
            InputStream is = conn.getInputStream();
            return is.readAllBytes(); // Convert response to byte array

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

