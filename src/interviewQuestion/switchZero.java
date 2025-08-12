package interviewQuestion;

public class switchZero {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j =0;
        for(int i=0;i<n;i++){
            if(nums[i] !=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i<n; i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        switchZero obj = new switchZero();
        obj.moveZeroes(nums);

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
