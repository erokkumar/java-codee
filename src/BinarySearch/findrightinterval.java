package BinarySearch;

public class findrightinterval {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];

        for(int i =0; i<n; i++){
            int idx = -1;
            int minst = Integer.MAX_VALUE;
            for(int j =0; j<n; j++){
                if(intervals[j][0] >= intervals[i][1] && minst > intervals[j][0]){
                    idx = j;
                    minst = intervals[j][0];
                }
            }
            ans[i] = idx;
        }
        return ans;
    }

    public static void main(String[] args) {
        findrightinterval solution = new findrightinterval();

        // Example input
        int[][] intervals = {{3,4}, {2,3}, {1,2}};

        // Calling the method
        int[] result = solution.findRightInterval(intervals);

        // Printing the result
        System.out.println("Result:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Interval " + i + ": " + result[i]);
        }
    }
}
