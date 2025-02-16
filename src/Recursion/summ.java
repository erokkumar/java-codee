package Recursion;

public class summ {
    public static int sum(int n){
        if (n < 10) {
            return n;
        }

        return n % 10 + sum(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        sum(n);
        System.out.println(sum(n));
    }
}
