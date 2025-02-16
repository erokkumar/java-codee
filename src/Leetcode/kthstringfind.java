package Leetcode;

import java.util.HashMap;

public class kthstringfind {
    public static String kthDistinctString(String[] arr, int k) {
        HashMap<String, Integer> freq = new HashMap<>();

        // Count frequency of each string
        for (String str : arr) {
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        }

        // Find the kth distinct string
        int count = 0;
        for (String str : arr) {
            if (freq.get(str) == 1) {
                count++;
                if (count == k) {
                    return str;
                }
            }
        }

        // If there are fewer than k distinct strings, return an empty string
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        String result = kthDistinctString(arr, k);
        if (!result.isEmpty()) {
            System.out.println("The " + k + "th distinct string is: " + result);
        } else {
            System.out.println("There are fewer than " + k + " distinct strings.");
        }
    }
}

