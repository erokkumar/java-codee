package Recursion;

import java.util.Scanner;

public class rain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0 , sum =0;
        for (int copy = num; copy>0; copy=copy/10){
            count++;
        }
        for (int flag = num; flag>0; flag=flag/10){
            int rem = flag%10;
            int power = 1;
            for (int i =1; i<= count; i++){
                power=power*rem;
            }
            sum = sum + power;
        }
        if (sum == num){
            System.out.println("it is Amstrong");
        }else {
            System.out.println("it  is not Amstrong");
        }


    }
}
