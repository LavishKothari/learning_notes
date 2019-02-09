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
