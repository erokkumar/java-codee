package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class relativerank {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        String[] result = new String[n];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(score[i], i); // ith athlete
        }

        Arrays.sort(score); // ascending

        for (int i = n - 1; i >= 0; i--) {
            int ath = mp.get(score[i]);
            if (i == n - 1) {
                result[ath] = "Gold Medal";
            } else if (i == n - 2) {
                result[ath] = "Silver Medal";
            } else if (i == n - 3) {
                result[ath] = "Bronze Medal";
            } else {
                result[ath] = String.valueOf(n - i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        relativerank ob = new relativerank();

        int arr[] = {5,4,3,2,1};

        String ans = Arrays.toString(ob.findRelativeRanks(arr));
        System.out.println(ans);
    }
}
