package DSA;

import java.util.Scanner;

public class staircase {
    public  static int staircasefind(int n){
        int result = 0;
        if (n <= 1){
            return n;
        }else {
            result = staircasefind(n-1) + staircasefind(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of staircase");
        int n = sc.nextInt();

        int result = staircasefind(n+1);
        System.out.println("the stair case find the value :" +result);
    }
}


