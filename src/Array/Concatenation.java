package Array;

import java.util.Arrays;

public class Concatenation {
    public static int [] getConcat(int[] nums){
        int n = nums.length;
        int[] ans = new int[n * 2];

        for(int i = 0; i<n*2; i++){
            ans[i] = nums[i % n];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,3,2,1};
        System.out.println(Arrays.toString(getConcat(num)));

    }
}
