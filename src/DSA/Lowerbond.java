package DSA;

import java.util.Scanner;

public class Lowerbond {
    public static int lowerbond(int arr[], int target){
        int result =-1;
        int low = 0, high = arr.length -1;
        while (low<=high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                result = mid;
                high = mid - 1;
            }else if(arr[mid]>target){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of element");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter the array element");

        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        //*******************************

        int result = lowerbond(arr,target);

        if (result == -1){
            System.out.println("not prsent the target value");
        }else {
            System.out.println("array element presnt index " +  result);
        }

    }
}


