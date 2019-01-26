/*
    (anything, 0, anything) answer should be 1
    (1, anything, anything) 1
*/
public class RecursiveModularExponentiation {
    public static void main(String[] args) {
        System.out.println(new RecursiveModularExponentiation().power(1, 34, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().power(13465, 0, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().power(2, 10, 100)); // should return 24

        System.out.println(new RecursiveModularExponentiation().powerAlternative(1, 34, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().powerAlternative(13465, 0, 34543)); // should return 1
        System.out.println(new RecursiveModularExponentiation().powerAlternative(2, 10, 100)); // should return 24

    }

    public long power(long a, long b, long mod) {
        if (b == 0) return 1;
        if (b == 1) return a % mod; // don’t make a mistake by just returning a
        long temp = power(a, b >> 1, mod);
        if ((b & 1) == 1) {
            return (((temp * temp) % mod) * a) % mod;
        } else {
            return (temp * temp) % mod;
        }
    }

    public long powerAlternative(long a, long b, long mod) {
        if (b == 0) return 1;
        if (a == 1) return a % mod;
        if ((b & 1) == 1) {
            return (a * powerAlternative((a * a) % mod, b >> 1, mod)) % mod;
        } else {
            return powerAlternative((a * a) % mod, b >> 1, mod);
        }
    }
}