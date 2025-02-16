package DSA;

import java.util.Arrays;

public class minimizehight {
    public int getMinDiff(int[] arr, int n, int k) {
        // Sort the array
        Arrays.sort(arr);

        // Initial difference between max and min without modification
        int diff = arr[n - 1] - arr[0];

        // Modify the bounds for the first and last tower
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            // Calculate new minimum and maximum after modifying heights
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            // Update the minimum difference
            diff = Math.min(diff, maxHeight - minHeight);
        }

        return diff;
    }

    public static void main(String[] args) {
        minimizehight sol = new minimizehight();

        // Test case 1
        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println("Test Case 1: Minimum difference = " + sol.getMinDiff(arr1, arr1.length, k1));

        // Test case 2
        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println("Test Case 2: Minimum difference = " + sol.getMinDiff(arr2, arr2.length, k2));

        // Test case 3
        int[] arr3 = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k3 = 5;
        System.out.println("Test Case 3: Minimum difference = " + sol.getMinDiff(arr3, arr3.length, k3));

        // Test case 4 (Edge case with one tower)
        int[] arr4 = {1};
        int k4 = 10;
        System.out.println("Test Case 4: Minimum difference = " + sol.getMinDiff(arr4, arr4.length, k4));
    }
}
