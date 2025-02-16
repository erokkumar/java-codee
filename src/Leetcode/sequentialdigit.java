package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sequentialdigit {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            queue.add(i);
        }

        List<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            if (temp >= low && temp <= high) {
                ans.add(temp);
            }

            int lastDigit = temp % 10;
            if (lastDigit + 1 <= 9) {
                queue.add(temp * 10 + (lastDigit + 1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        sequentialdigit solution = new sequentialdigit();
        List<Integer> result = solution.sequentialDigits(100, 300);
        System.out.println(result);
    }
}
