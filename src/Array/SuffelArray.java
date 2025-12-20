package Array;

import java.util.Arrays;

public class SuffelArray {
    public static int[] suffelArray(int[] num, int n){
        int[] ans = new int[n*2];
        int j =0;
        for(int i = 0; i<n; i++){
            ans[j] = num[i];
            j +=2;
        }
        int p = 1;
        for (int k = n; k<n*2; k++){
            ans[p] = num[k];
            p +=2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] num = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(suffelArray(num, n)));
    }
}
