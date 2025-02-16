package Recursion;

import java.util.Scanner;

public class power {
    public static int powervalue(int a, int b){
        if( b == 1){
            return a;
        }
        int ans =  powervalue(a , b/2);
        return ans * ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numuber ");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        int ans = powervalue(a,b);
        System.out.println(ans);

    }
}
