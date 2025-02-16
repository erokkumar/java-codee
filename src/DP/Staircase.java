package DP;

public class Staircase {
    public static int countWays(int n){
        int pre1 = 1 , pre2 = 1, current;

        for (int i = 2; i<=n; i++){
            current = pre1 + pre2;
            pre2 = pre1;
            pre1 = current;
        }
        return pre1;
    }
    public static void main(String[] args) {
        System.out.println(countWays(1));
        System.out.println(countWays(2));
        System.out.println(countWays(3));
        System.out.println(countWays(4));
    }
}
