package DP;

import java.util.Arrays;

public class perfectsquares {
    public int numSquares(int n) {
        int[] t = new int[n + 1];
        Arrays.fill(t, 10000);
        // t[i] = min number of perfect squares to get i
        // return t[n];

        t[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                t[i] = Math.min(t[i], 1 + t[i - j * j]);
            }
        }
        return t[n];
    }

        public static void main(String[] args) {
            perfectsquares solution = new perfectsquares();
            int n = 12; // You can change the value of n to test different cases
            int result = solution.numSquares(n);
            System.out.println("Minimum number of perfect squares to get " + n + ": " + result);
        }
    }
