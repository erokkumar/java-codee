package loop;

import java.util.Scanner;

public class fibii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0 , b = 1;
        for(int i = 2; i<n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
