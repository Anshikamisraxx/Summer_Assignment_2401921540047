package Day_5;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        String cleanedString = sb.toString();
        String reversedString = sb.reverse().toString();

        return cleanedString.equals(reversedString);
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = obj.isPalindrome(s);
        System.out.println(result);
    }
}
