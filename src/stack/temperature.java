package stack;

import java.util.Arrays;
import java.util.Stack;

public class temperature {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && t[i] >= t[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        temperature solution = new temperature();

        // Example usage:
        int[] temperatures3 = {30, 60, 90};
        int[] result3 = solution.dailyTemperatures(temperatures3);

        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = solution.dailyTemperatures(temperatures1);

        int[] temperatures2 = {30, 40, 50, 60};
        int[] result2 = solution.dailyTemperatures(temperatures2);


        // Print the results
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
