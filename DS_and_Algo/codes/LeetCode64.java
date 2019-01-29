public class LeetCode64 {
    public static void main(String[] args) {
        int answer = new LeetCode64().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}); // 7
        System.out.println(answer);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length, n;
        if (m == 0)
            return 0;
        n = grid[0].length;
        int dp[][] = new int[m][n];
        // dp[i][j] denotes the cost of minimum path from [0,0] to [i,j]
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

}
