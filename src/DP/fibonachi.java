package DP;


public class fibonachi {

              //top down approach

//    public static int fib(int n){
//        int a = 0, b = 1, c = 0;
//        if (n==0){
//            return a;
//        }
//       for (int i = 2; i<=n; i++){
//            c = a + b;
//            a = b;
//            b = c;
//        }
//       return c;
//    }

    //bottom up approach
    
public static int fib(int n){
    int a = 0, b = 1, c = 0;
    if (n==0){
        return a;
    }
    for (int i = 2; i<=n; i++){
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}
    public static void main(String[] args) {
       int n = 5;
        System.out.printf("fibonachi seris is " + n + " : " + fib(n));
    }

}
