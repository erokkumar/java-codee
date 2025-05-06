package Recursion;

public class fibonacci {
    public int fib(int n) {
        if(n==0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        fibonacci f = new fibonacci();
        int n = 3; // Example input
        System.out.println("Fibonacci of " + n + " is: " + f.fib(n));
    }
}
