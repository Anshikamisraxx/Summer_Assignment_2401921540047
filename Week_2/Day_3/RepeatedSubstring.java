package Week_2.Day_3;

public class RepeatedSubstring {

    public static boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);

        return trimmed.contains(s);
    }

    public static void main(String[] args) {
        String s = "abab";

        boolean result = repeatedSubstringPattern(s);
        System.out.println("Repeated Pattern: " + result);
    }
}
