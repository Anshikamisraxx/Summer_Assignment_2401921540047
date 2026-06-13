package Week_2.Day_4;
import java.util.*;
public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // handle multi-digit numbers
            }

            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                current = "";
                k = 0;
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            }

            else {
                current += ch;
            }
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter encoded string: ");
        String input = sc.nextLine();

        String result = decodeString(input);

        System.out.println("Decoded string: " + result);

        sc.close();
    }
}
