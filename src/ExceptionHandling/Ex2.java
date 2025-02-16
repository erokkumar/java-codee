package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
            sc.close();

        }
        catch (InputMismatchException e){
            System.out.println("Enter the wrong");
        }
        System.out.println(num);
    }
}
