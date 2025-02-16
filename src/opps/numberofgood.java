package opps;

public class numberofgood {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1, 1, 3};
            int result = numIdenticalPairs(nums);

            System.out.println("Number of Identical Pairs: " + result);
        }

        public static int numIdenticalPairs(int[] nums) {
            int n = nums.length;
            int goodPairs = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        goodPairs++;
                    }
                }
            }

            return goodPairs;
        }
    }

