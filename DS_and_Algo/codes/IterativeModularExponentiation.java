public class IterativeModularExponentiation {
    public static void main(String[] args) {
        System.out.println(new IterativeModularExponentiation().power(1, 43543, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(154654, 0, 435)); // returns 1
        System.out.println(new IterativeModularExponentiation().power(2, 10, 100)); // returns 24
    }
    public long power(long a, long b, long mod) {
        long tempResult = 1, result = 1;
        while (b != 0) {
            if ((b & 1) == 1)
                result = (result * a) % mod;
            b >>= 1;
            a = (a * a) % mod;
        }
        return result;
    }
}
