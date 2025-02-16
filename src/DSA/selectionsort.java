package DSA;

import java.util.Arrays;

public class selectionsort {
    public static void selectionsor(int arr[]){
        for (int i=0; i<arr.length; i++){
            int min_idx = i;
            for (int j =i+1; j<arr.length; i++){
                if (arr[j] <arr[min_idx]){
                    min_idx =j;
                }
            }
            if (min_idx != i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {45,15,58,25,41,88};

        selectionsor(arr);
        System.out.println("here is code: ");
        System.out.println(Arrays.toString(arr));
    }
}
