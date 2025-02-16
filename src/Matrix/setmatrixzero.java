package Matrix;

import java.util.HashSet;
import java.util.Set;

public class setmatrixzero {
        public void setMatrixZeroes(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();

            // Identify rows and columns to be set to zero
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] == 0) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }

            // Update the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (rows.contains(i) || cols.contains(j)) {
                        mat[i][j] = 0;
                    }
                }
            }
        }

        public static void main(String[] args) {
            setmatrixzero solution = new setmatrixzero();

            // Example matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 0, 6},
                    {7, 8, 9}
            };

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            // Call the method to modify the matrix
            solution.setMatrixZeroes(matrix);

            System.out.println("Matrix After Setting Zeroes:");
            printMatrix(matrix);
        }

        // Utility method to print the matrix
        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
}
