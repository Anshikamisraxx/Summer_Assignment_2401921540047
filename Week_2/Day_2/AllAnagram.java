package Week_2.Day_2;
import java.util.*;
public class AllAnagram {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) return result;

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'a']--;

            while (count[s.charAt(right) - 'a'] < 0) {
                count[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length()) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AllAnagram aa = new AllAnagram();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = aa.findAnagrams(s, p);
        System.out.println("Anagram indices: " + result);
    }
}

