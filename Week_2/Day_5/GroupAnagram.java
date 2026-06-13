package Week_2.Day_5;
import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Step 1: convert string to char array
            char[] arr = str.toCharArray();

            // Step 2: sort the array
            Arrays.sort(arr);

            // Step 3: convert back to string (this is our key)
            String key = new String(arr);

            // Step 4: store in hashmap
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        // Step 5: return all values
        return new ArrayList<>(map.values());
    }

    // Main function to test
    public static void main(String[] args) {
        GroupAnagram obj = new GroupAnagram();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println(result);
    }
}