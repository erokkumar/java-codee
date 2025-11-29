package interviewQuestion;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
    public static void fib(int n){
        int a =0, b = 1;

        for (int i = 0; i<n; i++){
            System.out.print(a + " ");
            int nx = a + b;
            a = b;
            b = nx;
        }
    }
}
