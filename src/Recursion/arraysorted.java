package Recursion;


public class arraysorted {
     static boolean isSorted(int arr[], int index){
         if (index >= arr.length - 1) {
             return true; // Base case: reached the end of the array
         }
         if (arr[index] > arr[index + 1]) {
             return false;
         } else {
             return isSorted(arr, index + 1);
         }
    }
    public static void main(String[] args) {

    int n = 5;
    int[] arr = {6, 7, 8, 9, 10};
    boolean ans = isSorted(arr, 0);

    if(ans)
    {
        System.out.println("Arraysort");
    }else

    {
        System.out.println("Notsort");
    }
}
}
