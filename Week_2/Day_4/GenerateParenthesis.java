package Week_2.Day_4;
import java.util.*;
public class GenerateParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        List<String> result = sol.generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        // Base case
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add '('
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add ')'
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
