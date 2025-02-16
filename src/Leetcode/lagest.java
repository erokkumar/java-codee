package Leetcode;

import java.util.Arrays;

public class lagest {
        public int findMaxK(int[] nums) {
            Arrays.sort(nums);

            int i = 0;
            int j = nums.length - 1;

            while (i < j) {
                if (-nums[i] == nums[j]) {
                    return nums[j];
                }
                else if (-nums[i] < nums[j]) {
                    j--;
                }
                else {
                    i++;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int arr[] = {-1,10,6,7,-7,1};
        lagest ob = new lagest();
        int ans = ob.findMaxK(arr);
        System.out.println(ans);
    }
}
