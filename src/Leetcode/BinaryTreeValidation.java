package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeValidation {
    public static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        List<Integer> children = new ArrayList<>();

        for (int e : leftChild) {
            if (e != -1) {
                children.add(e);
            }
        }

        for (int e : rightChild) {
            if (e != -1) {
                children.add(e);
            }
        }

        return children.size() == n - 1;
    }

    public static void main(String[] args) {
        int n = 3; // Change n and the arrays as needed
        int[] leftChild = {1,-1,-1}; // Example leftChild array
        int[] rightChild = {-1, -1, 1}; // Example rightChild array

        boolean isValid = validateBinaryTreeNodes(n, leftChild, rightChild);

        if (isValid) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
