package DSA;

import java.util.Scanner;

public class factorial {
    public static int findfactorial(int n){
        int result = 0;
        if(n==1 || n==0){
            return 1;
        }else {
            result = n * findfactorial(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int result = findfactorial(n);
        System.out.println("the factorial given answer: " + result);
    }
}
