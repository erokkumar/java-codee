package Array;

public class CountPartitions {
    public static void main(String[] args) {
        int[] nums = {2,4,9};
        System.out.println(countPartitions(nums));
    }

    public static int countPartitions(int num[]){
        int n = num.length;
        int sum = 0;
        int ff = 0;
        int div  = 0, cnt = 0;
        for(int i = 0; i<n-1; i++){
            ff += num[i];
            for (int j = i+1; j<n; j++){
                sum += num[j];
            }
            div = ff - sum;
            if (div%2 == 0){
                cnt++;
            }sum = 0;
    }return cnt;
}
}