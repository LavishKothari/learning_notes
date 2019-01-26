/**
 * Eculidean algorithm for finding GCD of 2 numbers
 * <p>
 * Time Complexity: O(log(a) + log(b)) for finding gcd(a,b)
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(new GCD().gcd(8,20));
    }

    private long gcd(long a, long b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
}
