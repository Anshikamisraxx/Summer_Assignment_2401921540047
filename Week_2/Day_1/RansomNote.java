package Week_2.Day_1;
import java.util.*;
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) +1);
        }

        for(char ch : ransomNote.toCharArray()) {
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can construct : " + result);
}
}