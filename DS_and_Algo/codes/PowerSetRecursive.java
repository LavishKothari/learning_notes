import java.util.*;

class PowerSetRecursive {
    public static void main(String[] args) {
        System.out.println(new PowerSetRecursive().powerSet(Arrays.asList(new Integer[]{1, 2, 3})));
    }

    public List<List<Integer>> powerSet(List<Integer> set) {
        return powerSet(set, 0);
    }

    private List<List<Integer>> powerSet(List<Integer> set, int counter) {
        if (counter == set.size()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return list;
        }
        List<List<Integer>> list1 = powerSet(set, counter + 1);
        List<List<Integer>> list2 = new ArrayList<>();
        for (List<Integer> cl : list1) {
            List<Integer> tempList = new ArrayList<>(cl);
            tempList.add(set.get(counter));
            list2.add(tempList);
        }
        list1.addAll(list2);
        return list1;
    }
}
