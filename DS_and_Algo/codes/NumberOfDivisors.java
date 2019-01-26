public class NumberOfDivisors {
    public static void main(String[] args) {
        int arr[] = new NumberOfDivisors().numberOfDivisors(12);
        System.out.println(arr[12]); // should print 6
    }

    /**
     * returns an array of integer such that
     * arr[i] stores number of divisors of i
     */
    public int[] numberOfDivisors(int n) {
        int[] result = new int[n + 1];
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = 2; // 1 and the number itself
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j += i)
                result[j]++;
        }
        return result;
    }
}
