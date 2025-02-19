package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Tringle {
    public static int countValidTriangles(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;

        Arrays.sort(arr);  // Sort the array
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {  // Fix the largest side
            int i = 0, j = k - 1;

            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);  // All pairs (i, ..., j-1) with j are valid
                    j--;
                } else {
                    i++;  // Increase sum by moving left pointer
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countValidTriangles(arr));
    }
}
