package Array;

import java.util.Arrays;

public class Particions {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        int k = 0;
        System.out.println(countPartitions(nums, k));
    }
    public static int countPartitions(int num[],int k){
        int n = num.length;
        int cnt = 0;
        Arrays.sort(num);
        for(int i =n-1; i>0; i--){
            for(int j = i-1; j>=0; j--){
                if ((num[i] - num[j]) < k){
                     cnt++;
                }
            }
        }
        return cnt;
    }
}
