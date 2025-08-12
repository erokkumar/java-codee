package interviewQuestion;

import java.util.Arrays;

public class plusone {
    public int[] plueso(int [] nums){
        int n =  nums.length;

        for(int i = n-1; i>=0; i--){
            if(nums[i]< 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int []num = {9,9,9};
        plusone ob = new plusone();
        int [] anss = ob.plueso(num);
        System.out.println(Arrays.toString(anss));
    }
}
