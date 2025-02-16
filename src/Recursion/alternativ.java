package Recursion;

import java.util.Scanner;

public class alternativ {
    public static int altersum(int n){
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return -n + altersum(n - 1);
        } else {
            return n + altersum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ans = altersum(n);
        System.out.println(ans);
    }
}
