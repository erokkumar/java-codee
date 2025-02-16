package DSA;

import java.util.Scanner;

public class fibonachi {
    public static int fibonachinum(int n){
        int result =0;
        if (n<=1){
            return n;
        }else {
            result = fibonachinum(n-1) + fibonachinum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number fibonachi series");
        int n = sc.nextInt();
        int result = fibonachinum(n);
        System.out.println("fibonachi series is answer : " + result);
    }
}
















