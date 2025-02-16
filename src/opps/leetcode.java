package opps;

import java.util.Arrays;

public class leetcode {
        public int minOperations(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int m = 1;
            for (int i=1;i<n; i++) {
                if (nums[i-1] != nums[i]) {
                    nums[m++] = nums[i];
                }
            }
            int ans = n;
            for (int i = 0, j = 0; i < m; ++i) {
                while (j < m && nums[j] - nums[i] <= n - 1) {
                    ++j;
                }
                ans = Math.min(ans, n - (j - i));
            }
            return ans;
        }

        public static void main(String[] args) {
            leetcode solution = new leetcode();

            // Test cases
            int[] nums1 = {4, 2, 5, 3};
            int result1 = solution.minOperations(nums1);
            System.out.println("Minimum operations for nums1: " + result1);

            int[] nums2 = {1, 2, 3, 5, 6};
            int result2 = solution.minOperations(nums2);
            System.out.println("Minimum operations for nums2: " + result2);

            int[] nums3 = {1, 10, 100, 1000};
            int result3 = solution.minOperations(nums3);
            System.out.println("Minimum operations for nums3: " + result3);
        }
    }
