package Leetcode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        pascal solution = new pascal();
        int rowIndex = 3; // You can change this to any desired row index.

        List<Integer> result = solution.getRow(rowIndex);

        System.out.print("Row " + rowIndex + " of Pascal's Triangle: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
