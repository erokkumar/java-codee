package DSA;

import java.util.Scanner;

public class findingpower {
    public static int findthepower(int a, int b) {
        int result = 0, mid = 0, finalresult =0;
        if ( b == 1) {
            return a;
        }else {
            mid = b/2;
            result = findthepower(a,mid);
            finalresult = result * result;
        }
        if (b%2 == 0) {
            return finalresult;
        }else {
            return a * finalresult;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

         int result = findthepower(a,b);
        System.out.println("a and b power value is " + result);
        }
    }

