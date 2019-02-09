package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are given an array and a number 'q'
 * You need to multiply each element of the array by q
 * and in the resulting array, you need to check for each
 * element and return the list of those elements whose digits
 * don't match the original number q.
 */
public class GSScreentingQ1 {
    public static void main(String[] args) {
        System.out.println(new GSScreentingQ1().solution(Arrays.asList(1, 2, 3), 5));
    }

    public List<Integer> solution(List<Integer> list, int q) {
        List<Integer> newList = list.stream().map(e -> e * q).collect(Collectors.toList());
        return newList.stream().filter(e -> isNoDigitMatching(e, q)).collect(Collectors.toList());
    }

    private boolean isNoDigitMatching(int a, int b) {
        List<Integer> la = getDigitList(a);
        List<Integer> lb = getDigitList(b);
        for (int i = 0; i < la.size(); i++) {
            if (lb.get(i) != 0 && la.get(i) != 0)
                return false;
        }
        return true;
    }

    private List<Integer> getDigitList(int a) {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++)
            list.add(0);
        while (a != 0) {
            list.set(a % 10, list.get(a % 10) + 1);
            a /= 10;
        }
        return list;
    }
}
