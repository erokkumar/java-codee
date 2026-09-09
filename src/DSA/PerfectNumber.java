package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");

        List<Integer> ans = new ArrayList<>();

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i<=n/2; i++){
            if(n % i == 0){
                sum += i;
                ans.add(i);
            }
        }
        if (sum == n){
            System.out.println(STR."\{n} is a perfect number");
            System.out.println(STR."The factors are: \{ans}");
        }
    }
}
