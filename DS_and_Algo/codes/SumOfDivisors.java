public class SumOfDivisors {
    public static void main(String[] args) {
        int arr[] = new SumOfDivisors().sumOfDivisors(12);
        System.out.println(arr[12]); // should print 28
    }

    /**
     * returns an array of integer such that
     * arr[i] stores sum of divisors of i
     */
    public int[] sumOfDivisors(int n) {
        int[] result = new int[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = i + 1; // 1 and the number itself
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i)
                result[j] += i;
        }
        return result;
    }
}
