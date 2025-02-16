package Recursion;

public class decrising {
    public static void  decrising(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        decrising(n - 1);
    }
    public static void  incrising(int n) {
        if (n == 1) {
            System.out.println(n+" ");
            return;
        }
        incrising(n - 1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n =10;
       // decrising(n);
        incrising(n);
    }
}
