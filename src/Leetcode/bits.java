package Leetcode;

public class bits {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }

        int diff = (totalXor ^ k);
        return Integer.bitCount(diff);
    }

    public static void main(String[] args) {
        bits ob = new bits();
        int[] arr = {2,1,3,4};
        int k = 1;

        int minob = ob.minOperations(arr,k);
        System.out.println(minob);
    }
}
