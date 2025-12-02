package Array;

import java.util.Scanner;

public class numbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        long sum = 0;

        // Calculate sum of digits from the string
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        // Keep summing until single digit
        while (sum >= 10) {
            long temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        System.out.println(sum);
        sc.close();
    }
}
