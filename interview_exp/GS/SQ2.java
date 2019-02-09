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
