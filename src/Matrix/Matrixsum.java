package Matrix;

class Matrixsum{
    static int R = 5;
    static int C = 5;
    public static void main(String[] args) {
        int [][]mat = {
                {0, 3, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 2, 4, 4},
                {0, 0, 0, 2, 4}
        };

        int res = findMaxsum(mat);
        System.out.println("Answer : - "+res);
    }

    static int findMaxsum(int[][] mat) {
        if (R < 3 || C < 3){
            System.out.println("Not possible");
            System.exit(0);
        }

        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<R-2; i++){
            for(int j = 0; j<C-2; j++){
                int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2])
                                     +(mat[i+1][j+1])+
                        (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                max_sum = Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }
}
