package String;



class split {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // Split the string into words by period (".")
        String[] arr = str.split("\\.");
        String ans = "";

        // Loop through the array in reverse order and build the result
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                ans += arr[i]; // No period after the last word
            } else {
                ans += arr[i] + "."; // Add period between words
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        split solution = new split();

        // Test case
        String input = "one.two.three.four";
        String result = solution.reverseWords(input);

        // Print the result
        System.out.println("Reversed words: " + result);
    }
}
