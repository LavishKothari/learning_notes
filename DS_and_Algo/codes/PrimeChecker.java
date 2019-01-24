/*
0 false
1 false
2 true (corner case)
3 true
4 false (perfect square)
8 false
11 true (a prime number)

for negative numbers it should throw an IllegalArgumentException
*/
public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(new PrimeChecker().isPrime(0)); // false
        System.out.println(new PrimeChecker().isPrime(1)); // false
        System.out.println(new PrimeChecker().isPrime(2)); // true
        System.out.println(new PrimeChecker().isPrime(3)); // true
        System.out.println(new PrimeChecker().isPrime(4)); // false
        System.out.println(new PrimeChecker().isPrime(8)); // false
        System.out.println(new PrimeChecker().isPrime(11)); // true
    }

    public boolean isPrime(long n) {
        if (n == 0 || n == 1)
            return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
