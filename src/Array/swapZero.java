package Array;

import java.util.Arrays;

public class swapZero {
    public static void main(String[] args) {
        int pos = 0;
        int [] arr = {4,0,5,0,0,6,7,0};
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
