# Structure
* First online coding round for GS
* Platform: [hackerrank](http://hackerrank.com)
* 2 questions were asked
* Duration: 2 hours

# Questions

## Questions to me
### Question 1 - Run-length Encoding

```java
package gs;

/**
 * Run-length encoding
 */
public class SQ1 {
    public static void main(String[] args) {
        System.out.println(SQ1.collapseString("xxxxxxyyx")); // 6x2y1x
        // this is an important case that you might miss
        System.out.println(SQ1.collapseString("x")); // 1x
    }
    public static String collapseString(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        int n = input.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = input.charAt(0);
        for (int i = 1; i < n; i++) {
            char current = input.charAt(i);
            if (current == prev) {
                count++;
            } else {
                sb.append(count);
                sb.append(prev);
                prev = current;
                count = 1;
            }
        }
        if(sb.length() == 0 || sb.charAt(sb.length()-1) != input.charAt(n-1)) {
            sb.append(count);
            sb.append(prev);
        }
        return sb.toString();
    }
}
```

### Question 2 - Finding the number of edges
* The following code shows what I thought during interview
* Another approach can be to count the total number of edges (from  `a` to `b` and also from `b` to `a`) and then divide it by 2.
```java
package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQ2 {
    public static void main(String[] args) {
        test1(); // 8
        test2(); // 3
        test3(); // 29
    }

    public static void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 0, 0, 1));
        list.add(Arrays.asList(0, 1, 1, 1));
        list.add(Arrays.asList(1, 0, 0, 1));

        System.out.println(countConnections(list));
    }

    public static void test2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 1, 1, 1));

        System.out.println(countConnections(list));
    }

    public static void test3() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 1, 1, 1));
        list.add(Arrays.asList(1, 1, 1, 1));
        list.add(Arrays.asList(1, 1, 1, 1));

        System.out.println(countConnections(list));
    }


    static int countConnections(List<List<Integer>> matrix) {
        if (matrix == null || matrix.size() == 0) // no rows
            return 0;

        int m = matrix.size();
        int n = matrix.get(0).size();
        // it is important to see what directions that you need to consider
        int[][] dir = new int[][]{{1, -1}, {1, 0}, {1, 1}, {0, 1}};
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.get(i).get(j) == 0)
                    continue;
                for (int[] cd : dir) {
                    int x = cd[0] + i;
                    int y = cd[1] + j;
                    if (x < m && x >= 0 && y >= 0 && y < n && matrix.get(x).get(y) == 1) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
```

## Questions to one of my friend

### Question 1 - Playing with numbers

* You are given an array `arr` and a number `q`.
* multiply each element of the array with this number `q`
* return another array which contains only the elements that have no digit that is also present in `q`

```java
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
```

### Question 2 - Count the number of strictly increasing or decreasing triplets
* Count the number of strictly increasing or decreasing triplets
* You are not allowed to shuffle the array contents.
* We are interested in two types of triplets:
    * `a[i] < a[j] < a[k]` for `i < j < k`
    * `a[i] > a[j] > a[k]` for `i > j > k`
* Time complexity = `O(n^2)`
* Space complexity = `O(n)`

```java
package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GSScreeningQ2 {
    public static void main(String[] args) {
        System.out.println(new GSScreeningQ2().solution(Arrays.asList(1, 2, 3, 4)));
        System.out.println(new GSScreeningQ2().solution(Arrays.asList(10, 5, 30, 4, 3, 40)));
    }

    public List<Integer> solution(List<Integer> list) {
        List<Integer> greater = new ArrayList<>(list.size());
        List<Integer> smaller = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int g = 0, s = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > current)
                    g++;
                else if (list.get(j) < current)
                    s++;
            }
            greater.add(g);
            smaller.add(s);
        }

        int increasing = 0, decreasing = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j))
                    increasing += greater.get(j);
                else if (list.get(i) > list.get(j))
                    decreasing += smaller.get(j);
            }
        }
        return Arrays.asList(increasing, decreasing);
    }
}
```