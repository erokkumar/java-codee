package DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class powerofbigint {
    public static BigInteger powerFind(BigInteger a,int b){
        BigInteger  result , finalrr;

        if (b==1){
            return a;
        }
        else {
            result = powerFind(a, b/2);
            finalrr = result.multiply(result);
            if (b % 2 == 0){
                return finalrr;
            }else {
                return a.multiply(result);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        BigInteger result = powerFind(a,b);
        System.out.println("Power of an elments is :" + result);
    }
}
