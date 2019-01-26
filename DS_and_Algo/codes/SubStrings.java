import java.util.*;

public class SubStrings {
    public static void main(String[] args) {
        System.out.println(new SubStrings().getSubstrings("Hello"));
    }

    public List<String> getSubstrings(String s) {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                subStrings.add(s.substring(i, j + 1));
            }
        }
        return subStrings;
    }
}
