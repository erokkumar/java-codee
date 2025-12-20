package Array;

import java.util.Arrays;

public class SortingSpecfic {
    public static void sortIt(int[] arr){
        int [] ans = new int[arr.length];
        int j = 0;
        int k = 0;
        for(int i = arr.length-1; i >= 0 ; i--){
            if (arr[i] % 2 != 0){
                ans[k] = arr[i];
                k++;
            }
        }
        for(int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                ans[k] = arr[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        sortIt(arr);
    }
}
