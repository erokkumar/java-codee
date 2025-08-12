package DP;

public class
houserubber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int ans[] = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0] , nums[1]);

        for(int i =2; i<n; i++){
            ans[i] = Math.max(nums[i] + ans[i-2] , ans[i-1]);
        }
        return ans[n-1];
    }
    public static void main(String[] args) {
        houserubber solution = new houserubber();

        // Example 1
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + solution.rob(nums2));
        // Example 2
        int[] nums1 = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + solution.rob(nums1));



    }
}

