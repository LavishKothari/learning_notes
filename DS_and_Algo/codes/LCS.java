public class LCS {
    public static void main(String[] args) {
        System.out.println(new LCS().lcs("", "")); // should return 0
        System.out.println(new LCS().lcs("ABCDGH", "AEDFHR")); // should return 3
        System.out.println(new LCS().lcs("AGGTAB", "GXTXAYB")); // should return 4

    }

    public int lcs(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            dp[i][0] = 0;
        for (int j = 0; j < n; j++)
            dp[0][j] = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int diff = (x.charAt(i - 1) == y.charAt(j - 1) ? 1 : 0);
                dp[i][j] = max3(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1] + diff);
            }
        }
        return dp[m][n];
    }

    private int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
