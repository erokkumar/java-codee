package Array;

public class OprationofArray {

    public void applyOpration(int [] nums){
        int n = nums.length;

        for (int i =0; i<n - 1; i++){
            if (nums[i]  == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int idx = 0;

        for (int i = 0; i<n; i++){
            if (nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }

        while (idx <n){
            nums[idx++] = 0;
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,2,1,1,0};
        OprationofArray oprationofArray = new OprationofArray();
        oprationofArray.applyOpration(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}
