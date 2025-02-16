package Matrix;

class findnum {
    public static boolean searchRowMatrix(int [][] mat , int x){

        int n = mat.length;
        int m = mat[0].length;

        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Define the number to search
        int x = 5;

        // Create an instance of Solution and invoke the function
        findnum solution = new findnum();
        boolean result = solution.searchRowMatrix(mat, x);

        // Print the result
        if (result) {
            System.out.println("Element found in the matrix." + result);
        } else {
            System.out.println("Element not found in the matrix." + result);
        }
    }
}
