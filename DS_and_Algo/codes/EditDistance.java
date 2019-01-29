public class EditDistance {
    public static void main(String[] args) {
        System.out.println(new EditDistance().editDistance("", "")); // should return 0
        System.out.println(new EditDistance().editDistance("sunday", "saturday")); // should return 3
        System.out.println(new EditDistance().editDistance("cat", "cut")); // should return 0
    }

    public int editDistance(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] dp = new int[m + 1][n + 1];
        // base cases
        // if the length of any one string is 0, then the answer is length of other string
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int diff = (x.charAt(i - 1) == y.charAt(j - 1) ? 0 : 1);
                dp[i][j] = min3(dp[i][j - 1] + 1, dp[i - 1][j] + 1, diff + dp[i - 1][j - 1]);
            }
        }
        return dp[m][n];
    }

    public int min3(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
