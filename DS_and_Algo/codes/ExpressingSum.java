/**
 * https://www.geeksforgeeks.org/find-k-numbers-which-are-powers-of-2-and-have-sum-n/
 *
 * Question:
 * given n and k, you need to find if n can be expressed as
 * sum of k (same or different) numbers such that each number
 * is a power of 2
 * <p>
 * Solution:
 * dp[i][j] stores if we can achieve j with i different
 * terms where each term is power of 2.
 * <p>
 * base cases if i == 0 then false for every j
 * if j == 0 false for every i
 * if j == 1 true for i == 1
 * if(i is 1 and j is a power of 2, then it's true)
 */
public class ExpressingSum {
    public static void main(String[] args) {
        ExpressingSum obj = new ExpressingSum();
        System.out.println(obj.find(3, 9) + " " + obj.simpleSolution(3, 9)); // true, 9 = 4 + 4 + 1
        System.out.println(obj.find(5, 33) + " " + obj.simpleSolution(5, 33)); // true, 33 = 8 + 8 + 8 + 8 + 1
        System.out.println(obj.find(1, 1024) + " " + obj.simpleSolution(1, 1024));
        System.out.println(obj.find(9, 1024) + " " + obj.simpleSolution(9, 1024));
        System.out.println(obj.find(15, 1024) + " " + obj.simpleSolution(15, 1024));
        System.out.println(obj.find(2, 25) + " " + obj.simpleSolution(2, 25));
        System.out.println(obj.find(4, 25) + " " + obj.simpleSolution(4, 25));
        System.out.println(obj.find(3, 15) + " " + obj.simpleSolution(3, 15));
        // number of bits in a number - if k is less than this then the answer is simply false

        System.out.println(obj.find(4, 15) + " " + obj.simpleSolution(4, 15));
        System.out.println(obj.find(5, 15) + " " + obj.simpleSolution(5, 15));
        System.out.println(obj.find(15, 15) + " " + obj.simpleSolution(15, 15));

        int N, K;
        N = K = 100;
        boolean correct = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                boolean temp = obj.find(j, i) == obj.simpleSolution(j, i);
                correct = correct && temp;
                if (!temp) {
                    System.out.println("wrong for = " + i + " " + j);
                }
            }
        }
        System.out.println("correct = " + correct);
    }

    public boolean simpleSolution(int k, int n) {
        if (k > n || n == 0 || k == 0) return false;
        // counting the number of 1s in n's binary representation
        int counter = 0;
        while (n != 0) {
            counter++;
            n = (n & (n - 1));
        }
        return counter <= k;
    }

    public boolean find(int k, int n) {
        assert k >= 0 && n >= 0;
        if (n == 0) return false;
        if (k == 1 && (n & (n - 1)) == 0) // if k is 1 and n is a power of 2
            return true;
        boolean[][] dp = new boolean[k + 1][n + 1];
        for (int j = 1; j <= n; j++)
            dp[0][j] = false;
        for (int i = 1; i <= k; i++)
            dp[i][0] = false;
        dp[0][0] = true;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                int cp = 1; // current power
                while (!dp[i][j] && cp <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - cp];
                    cp <<= 1;
                }
            }
        }

        return dp[k][n];
    }
}
