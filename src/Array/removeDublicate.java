package Array;

import java.util.Scanner;

public class removeDublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(arr[i] == arr[j]){
//                    for(int k = j; k<n-1; k++){
//                        arr[k] = arr[k+1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
        int j = 0;
        for(int  i = 0; i<n; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(j+1);
        for (int i = 0; i < j + 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
