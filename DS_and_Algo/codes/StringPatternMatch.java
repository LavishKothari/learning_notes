import java.util.ArrayList;
import java.util.List;

public class StringPatternMatch {
    public static void main(String[] args) {
        String longText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of " +
                "Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println(new StringPatternMatch().matchNaive("abcde", "de"));
        System.out.println(new StringPatternMatch().matchNaive("THIS IS A TEST TEXT", "TEST"));
        System.out.println(new StringPatternMatch().matchNaive("AABAACAADAABAABA", "AABA"));
        System.out.println(new StringPatternMatch().matchNaive("AAAAA", "AAA"));
        System.out.println(new StringPatternMatch().matchNaive(longText, "electronic"));

        System.out.println("____________________");

        System.out.println(new StringPatternMatch().matchRabinKarp("abcde", "de"));
        System.out.println(new StringPatternMatch().matchRabinKarp("THIS IS A TEST TEXT", "TEST"));
        System.out.println(new StringPatternMatch().matchRabinKarp("AABAACAADAABAABA", "AABA"));
        System.out.println(new StringPatternMatch().matchRabinKarp("AAAAA", "AAA"));
        System.out.println(new StringPatternMatch().matchRabinKarp(longText, "electronic"));


    }

    /**
     * Time complexity - O((n-m)*(m)) where
     * m is the length of pattern, and n is the lenght of string
     *
     * @param str
     * @param pattern
     * @return
     */
    public List<Integer> matchNaive(String str, String pattern) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length() && i <= str.length() - pattern.length(); i++) {
            int counter = 0;
            for (int j = 0; j < pattern.length(); j++) {
                if (i + j < str.length() && pattern.charAt(j) == str.charAt(i + j))
                    counter++;
                else break;
            }
            if (counter == pattern.length())
                result.add(i);
        }
        return result;
    }

    public List<Integer> matchRabinKarp(String str, String pattern) {
        int base = (1 << 8);
        int prime = 9973; // any big enough prime number
        int patternHash = hash(pattern, base, prime);
        int strHash = hash(str.substring(0, pattern.length()), base, prime);
        List<Integer> result = new ArrayList<>();
        int firstHashPower = power(base, pattern.length() - 1, prime);
        for (int i = 0; i <= str.length() - pattern.length(); i++) {
            if (patternHash == strHash) {
                int counter = 0;
                for (int j = 0; j < pattern.length(); j++) {
                    if (str.charAt(i + j) == pattern.charAt(j))
                        counter++;
                    else break;
                }
                if (counter == pattern.length())
                    result.add(i);
                else
                    System.out.println("this is a miss");
            }
            if (i + pattern.length() < str.length()) {
                strHash = (strHash - (str.charAt(i) * firstHashPower) % prime) * base + str.charAt(i + pattern.length());
                strHash = (strHash % prime + prime) % prime;
            }
        }
        return result;
    }

    private int power(int a, int b, int mod) {
        if (a == 0 || a == 1)
            return 1;
        if (b == 1)
            return a % mod;
        int temp = power(a, b / 2, mod);
        if ((b & 1) == 0)
            return (temp * temp) % mod;
        return (((temp * temp) % mod) * a) % mod;
    }

    // a rolling hash function
    private int hash(String s, int base, int mod) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++)
            hash = (hash * base + s.charAt(i)) % mod;
        return hash;
    }

}
