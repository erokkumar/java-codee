package interviewQuestion;

public class AlphabetWave {
    public static void main(String[] args) {
        int n = 4; // kitni lines chahiye

        for (int i = 1; i <= n; i++) {
            // 1️⃣ Print spaces
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }

            // 3️⃣ Print decreasing alphabets
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }

            // Next line
            System.out.println();
        }
    }
}

