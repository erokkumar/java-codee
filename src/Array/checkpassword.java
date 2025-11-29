package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class checkpassword {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        int n = password.length();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(password.charAt(i)+"");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        if (n <=10){
            System.out.println("Password is Strong");
        }else {
            System.out.println("Password is Weak");
        }
        if (password.contains("1234567890")){
            System.out.println("Password is Weak");
        }else {
            System.out.println("Password is Strong");
        }
    }
}
