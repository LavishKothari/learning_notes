import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(new SieveOfEratosthenes().getPrimeBitSet(100));
    }

    public BitSet getPrimeBitSet(int size) {
        BitSet isPrime = new BitSet(size); // initially every bit is false
        isPrime.flip(0, size); // making every bit to true
        isPrime.set(0, false); // 0 is not a prime
        isPrime.set(1, false); // 1 is not a prime

        for (int i = 2; i * i < size; i++) {
            if (isPrime.get(i)) { // if i is prime then making all it's multiples non-prime
                for (int j = i * i; j < size; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        return isPrime;
    }
}
