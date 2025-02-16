package DSA;

import java.util.Scanner;

public class binaryrecusion {
    public static int findmaXvalue(int arr[], int low , int high , int target){
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                 return findmaXvalue(arr, mid+1, high, target);
            }else {
                return findmaXvalue(arr, low, mid-1, target);
            }
        }
        return result -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] ={2,5,10,15,45};
        System.out.println("Enter the target value");
        int n = sc.nextInt();

        int result = findmaXvalue(arr , 0 , arr.length-1 , n);
        System.out.println("Araay max value : " + result);
    }
}
