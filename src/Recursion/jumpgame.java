package Recursion;

public class jumpgame {

    public boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }

    public boolean canJump(int[] nums, int position) {
        if (position >= nums.length - 1) {
            return true;
        }
        int maxJump = nums[position];
        for (int i = 1; i <= maxJump; i++) {
            if (canJump(nums, position + i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        jumpgame jg = new jumpgame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Can jump: " + jg.canJump(nums));
    }
}
