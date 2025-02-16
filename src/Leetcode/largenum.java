package Leetcode;

import java.util.Arrays;

public class largenum {

        // Method to find the sum of the two largest elements
        public static int pairsum(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);  // Sort the array
            int maxi = arr[n-1] + arr[n-2];  // Sum of the two largest elements
            return maxi;
        }

        // Main method to test the pairsum method
        public static void main(String[] args) {
            int[] arr = {10, 4, 3, 50, 23, 90};  // Example array
            int result = pairsum(arr);  // Call the pairsum method
            System.out.println("The sum of the two largest elements is: " + result);  // Output the result
        }
}
