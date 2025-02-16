package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort {
    public static void bubblesortarray(int arr[]){
        for (int i = 0; i<arr.length; i++){
            boolean swap = false;
            for (int j= 0; j<arr.length - i -1; j++){
                if (arr[j] > arr[i+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {45,2,89,41,85,96};
        bubblesortarray(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
