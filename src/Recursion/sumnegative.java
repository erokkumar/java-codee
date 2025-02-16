package Recursion;

public class sumnegative {
    public static int sumOfAlternateSigns(int n){
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return -n + sumOfAlternateSigns(n - 1);
        } else {
            return n + sumOfAlternateSigns(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfAlternateSigns(n);
        System.out.println(sum);
    }
}
