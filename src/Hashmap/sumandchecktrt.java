package Hashmap;

import java.util.HashMap;

public class sumandchecktrt {
    boolean twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                return true; // Pair found
            }
            map.put(arr[i], i);
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        sumandchecktrt solution = new sumandchecktrt();
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        boolean result = solution.twoSum(arr, target);
        if (result) {
            System.out.println("Pair exists that sums to " + target);
        } else {
            System.out.println("No pair exists that sums to " + target);
        }
    }
}
