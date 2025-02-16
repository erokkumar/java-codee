package Leetcode;

public class mincostclaming {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ans = 0;

        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        ans = Math.min(cost[n - 1], cost[n - 2]);
        return ans;
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int result = minCostClimbingStairs(cost);
        System.out.println("The minimum cost to climb the stairs is: " + result);
    }
}
