package Week_2.Day_5;
import java.util.*;
public class StringCompression {
    public int compress(char[] chars) {
        int index = 0; // where to write
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count occurrences
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[index++] = current;

            // write count if > 1
            if (count > 1) {
                String cnt = Integer.toString(count);
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    // Main function to test
    public static void main(String[] args) {
        StringCompression obj = new StringCompression();

        char[] chars = {'a','a','b','b','c','c','c'};

        int newLength = obj.compress(chars);

        // print compressed array
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}