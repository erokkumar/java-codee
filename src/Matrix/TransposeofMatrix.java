package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeofMatrix {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int j = 0; j < m; j++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                row.add(mat[i][j]);
            }
            result.add(row);
        }

        return result;
    }
    public static void main(String[] args) {
        int mat[][] ={{1, 1, 1, 1},
                      {2, 2, 2, 2},
                      {3, 3, 3, 3},
                      {4, 4, 4, 4}};
        TransposeofMatrix tm = new TransposeofMatrix();
        ArrayList<ArrayList<Integer>> ans = tm.transpose(mat);
        System.out.println(ans);
    }
}
