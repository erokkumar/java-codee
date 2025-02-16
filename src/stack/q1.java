package stack;

import java.util.Scanner;
import java.util.Stack;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      //  String str = "II";
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i<str.length()+1; i++){
            s.push(i + 1);

            if (i == str.length() || str.charAt(i) == 'I'){
                while(!s.isEmpty()){
                    System.out.print(s.pop());
                }
            }
        }
      //  System.out.println(" Stack is  : " + s);
    }
}
