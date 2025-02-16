package DSA;

import java.util.Scanner;

public class squareroot {
    public static  int Squareroot(int num){
        int low = 0, high = num, result = -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            long val = mid * mid;
            if (val == num){
               return mid;
            } else if(val < num){
                result = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = Squareroot(num);
        System.out.println(" the square root value: " +  result);
        
    }
}
