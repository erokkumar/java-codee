package stack;

import java.util.Stack;

public class explain {
    public static void main(String[] args) {
        Stack <Integer> stack1 = new Stack<>();
        //Push the element
        stack1.push(2);
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        //print
        System.out.println("top element are : " + stack1.peek());

        // top element are delete are using pop() method

        stack1.pop();
        System.out.println("top element are : " + stack1.peek());

    }
}
