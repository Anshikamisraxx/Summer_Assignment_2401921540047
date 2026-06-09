package Week_2.Day_2;
import java.util.*;
public class LongestSubstring {
public int lengthOfLongestSubstring(String s) {
    
    HashMap<Character, Integer> map = new HashMap<>();
    int left = 0, max = 0;

    for(int right = 0; right < s.length(); right++) {

        char ch = s.charAt(right);

        if(map.containsKey(ch)) {
            left = Math.max(left, map.get(ch) + 1);
        }
        map.put(ch, right);
        max = Math.max(max, right - left + 1);
    }
    return max;
}

public static void main(String[] args) {
    LongestSubstring ls = new LongestSubstring();
    String s = "abcabcbb";
    int result = ls.lengthOfLongestSubstring(s);
    System.out.println("Length : " + result);

}
}
