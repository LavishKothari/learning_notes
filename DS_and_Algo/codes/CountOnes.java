public class CountOnes {
    public static void main(String[] args) {
        System.out.println(new CountOnes().countOne(10)); // should pring 2
        System.out.println(new CountOnes().countOne(-5000));
    }

    public int countOne(long n) {
        int answer = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                answer++;
            n >>>= 1; // should use unsigned right-shift, so that it works for negative also
        }
        return answer;
    }
}
