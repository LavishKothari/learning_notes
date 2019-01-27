public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(new FibonacciNumbers().getNth(10)); // 55
        System.out.println(new FibonacciNumbers().getNthDP(10)); // 55
        System.out.println(new FibonacciNumbers().getNthIterative(10)); // 55
    }

    /**
     * Recursion:
     * Time complexity = O(2^n) for finding nth fibonacci number
     */
    public long getNth(int n) {
        if (n == 1 || n == 2)
            return 1;
        return getNth(n - 1) + getNth(n - 2);
    }

    /**
     * Iterative - Dynamic Programming approach:
     * Time complexity = O(n) for finding nth fibonacci number
     * Space complexity = O(n)
     */
    public long getNthDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    /**
     * Iterative with constant space, time compleity: O(n)
     */
    public long getNthIterative(int n) {
        long a = 0, b = 1, answer = 0;
        for (int i = 2; i <= n; i++) {
            answer = a + b;
            a = b;
            b = answer;
        }
        return answer;
    }
}
