import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PowerSetIterative {
    public static void main(String[] args) {
        System.out.println(new PowerSetIterative().powerSetIterative(Arrays.asList(new Integer[]{1, 2, 3})));
    }

    public List<List<Integer>> powerSetIterative(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        int power = (1 << list.size());
        for (int i = 0; i < power; i++) {
            int ci = i;
            List<Integer> tempList = new ArrayList<>();
            int counter = 0;
            while (ci != 0) {
                if ((ci & 1) == 1)
                    tempList.add(list.get(counter));
                counter++;
                ci >>= 1;
            }
            result.add(tempList);
        }
        return result;
    }
}
