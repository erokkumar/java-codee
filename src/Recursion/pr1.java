package Recursion;

public class pr1 {
    public static int sumii(int n){
        if (n == 1){
            return n;
        }
        return n * sumii (n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumii(n));
    }
}
