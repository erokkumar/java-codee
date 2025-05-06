package opps;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int sub(int a, int b){
        int subs = a - b;
        return subs;
    }

    public int mul(int a, int b){
        int mul = a * b;
        return mul;
    }
    private int div(int a, int b){
        int divv = a / b;
        return divv;
    }
    static void num(){
        System.out.println("This is a static method");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        Calculator ob = new Calculator();
        ob.num(); // Calling static method
        int ans = 0;
        if (operation == '+'){
            ans = ob.add(a, b);
        } else if (operation == '-') {
            ans = ob.sub(a, b);
        } else if (operation == '*') {
            ans = ob.mul(a, b);
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return;
            }
            ans = ob.div(a, b);
        } else {
            System.out.println("Invalid operation");
            return;
        }
        System.out.println("Result: " + ans);

    }
}
