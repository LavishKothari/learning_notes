import java.util.ArrayList;
import java.util.List;

// 9C3 should return 84
public class NCKModP {
    public static void main(String[] args) {
        System.out.println(new NCKModP().nCkModP(9, 3, 1000000007)); // 84
        System.out.println(new NCKModP().nCkModP(1, 1, 1000000007)); // 1
        System.out.println(new NCKModP().nCkModP(1, 0, 1000000007)); // 1
    }

    // assuming that p is prime
    public long nCkModP(int n, int k, long p) {
        List<Long> facts = getFactorials(n, p);
        long numerator = facts.get(n);
        long denominator = (facts.get(k) * facts.get(n - k)) % p;

        return (numerator * power(denominator, p - 2, p)) % p;
    }

    private long power(long a, long b, long mod) {
        if (b == 0)
            return 1;
        long temp = power(a, b / 2, mod);
        if ((b & 1) == 1) {
            return (((temp * temp) % mod) * a) % mod;
        } else return (temp * temp) % mod;
    }

    private List<Long> getFactorials(int n, long p) {
        List<Long> facts = new ArrayList<>(n + 1);
        facts.add(1L); // factorial of 0 is 1
        for (int i = 1; i <= n; i++) {
            facts.add((facts.get(i - 1) * i) % p);
        }
        return facts;
    }
}
