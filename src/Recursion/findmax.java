package Recursion;

public class findmax {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maxRest = findMax(arr, n - 1);
        return Math.max(maxRest, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int maxValue = findMax(arr, arr.length);
        System.out.println("Max value in the array: " + maxValue); // Output: Max value in the array: 22
    }
}
