package interviewQuestion;

public class NumofZero {
    public static void main(String[] args) {
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        long count = 0;   // final answer
        long streak = 0;  // current consecutive zeros

        for (int num : nums) {
            if (num == 0) {
                streak++;           // extend zero streak
                count += streak;    // add all subarrays ending here
            } else {
                streak = 0;         // reset
            }
        }
        System.out.println(count);
    }
}
