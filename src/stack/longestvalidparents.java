package stack;

import java.util.Stack;

public class longestvalidparents {
    public int maxLength(String s) {
        // code here
        int n = s.length();
        Stack<Integer> sc = new Stack<>();
        sc.push(-1);

        int ans = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '('){
                sc.push(i);
            }else{
                sc.pop();
                if(!sc.isEmpty()){
                    ans = Math.max(ans, i - sc.peek());
                }else{
                    sc.push(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        longestvalidparents ob = new longestvalidparents();
        String s1 = "((()";
        System.out.println("Longest valid parentheses length: " + ob.maxLength(s1)); // Output: 4

        String s2 = ")()())";
        System.out.println("Longest valid parentheses length: " + ob.maxLength(s2)); // Output: 4

        String s3 = "())()";
        System.out.println("Longest valid parentheses length: " + ob.maxLength(s3));
    }
}
