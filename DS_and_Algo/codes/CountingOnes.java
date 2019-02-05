public class CountingOnes {
    public static void main(String[] args) {
        System.out.println(new CountingOnes().countOneNaive(1234));
        System.out.println(new CountingOnes().countOnesGood(1234));

        System.out.println(new CountingOnes().countOneNaive(1024));
        System.out.println(new CountingOnes().countOnesGood(1024));

        System.out.println(new CountingOnes().countOneNaive(456123));
        System.out.println(new CountingOnes().countOnesGood(456123));

        System.out.println(new CountingOnes().countOneNaive(0));
        System.out.println(new CountingOnes().countOnesGood(0));

        System.out.println(new CountingOnes().countOneNaive(-44));
        System.out.println(new CountingOnes().countOnesGood(-44));
    }

    public int countOneNaive(long n) {
        int answer = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                answer++;
            n >>>= 1; // should use unsigned right-shift, so that it works for negative also
        }
        return answer;
    }

    /**
     * Works only for integers greater or than equals to 0
     * <p>
     * Time Complexity: O(count of 1s in the number)
     */
    public int countOnesGood(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n = (n & (n - 1));
        }
        return c;
    }
}
