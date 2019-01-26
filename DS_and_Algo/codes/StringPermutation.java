import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println(new StringPermutation().getPermutations("Sun"));
    }

    public List<String> getPermutations(String s) {
        List<String> result = new ArrayList<>();
        getPermutations(s.toCharArray(), result, 0);
        return result;
    }

    private void getPermutations(char[] arr, List<String> result, int counter) {
        if (counter == arr.length) { // base condition
            result.add(new String(arr));
            return;
        }

        /* i should be started from couter and not from counter+1 */
        for (int i = counter; i < arr.length; i++) {
            swap(arr, i, counter);
            getPermutations(arr, result, counter + 1);
            swap(arr, i, counter);
        }
    }

    private void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
