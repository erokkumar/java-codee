package priority;

import java.util.PriorityQueue;

public class secondlagets {

        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minheap = new PriorityQueue<>();
            for(int num : nums){
                minheap.add(num);
                if(minheap.size() > k){
                    minheap.remove();
                }
            }
            return minheap.peek();
        }

        public static void main(String[] args) {
            secondlagets solution = new secondlagets();

            // Example 1
            int[] nums1 = {3, 2, 1, 5, 6, 4};
            int k1 = 2;
            int result1 = solution.findKthLargest(nums1, k1);
            System.out.println("Example 1 - Result: " + result1);  // Expected output: 5

            // Example 2
            int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
            int k2 = 4;
            int result2 = solution.findKthLargest(nums2, k2);
            System.out.println("Example 2 - Result: " + result2);  // Expected output: 4
        }
    }

