package Backtracking;

import java.util.Scanner;

public class tilingproblam {
    public static int getway(int n){
        if (n<=3){
            return n;
        }
        return getway(n-1) + getway(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter th number");
        int n = sc.nextInt();
        System.out.println("Tiling problam given answer = "+getway(n));

    }
}
