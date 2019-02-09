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
