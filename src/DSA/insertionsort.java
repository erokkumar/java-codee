package DSA;

import java.util.Arrays;


public class insertionsort {
    public static void insertion(int arr[]){
        for (int i =0; i<arr.length; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,58,45,68,96,13,};

        insertion(arr);
        System.out.println("here is code");
        System.out.println(Arrays.toString(arr));
    }
}
