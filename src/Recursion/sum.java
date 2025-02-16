package Recursion;

public class sum {
    public static int sumn(int n){
        if (n  <= 1){
            return n;
        }
        return n + sumn(n - 1) + sumn(n - 1);
    }
    public static void main(String[] args) {
        int n   = 4;
        System.out.println(sumn(n));
    }
}
