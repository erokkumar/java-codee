package Recursion;

public class printnum {
    static void printnu(int n){
        if(n == 0) return;
        printnu(n - 1);
        System.out.println(n + n +" ");
    }
    public static void main(String[] args) {
        // Print numbers from 1 to n using recursion
        printnu(5);
    }
}
