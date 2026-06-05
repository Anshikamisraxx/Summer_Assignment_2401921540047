package Day_5;

public class ReverseString {
    public void reverseString(char[] s) {

        int n = s.length;

        for(int i = 0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
    }

        public static void main(String[] args) {
            ReverseString obj = new ReverseString();
            char[] s = {'h','e','l','l','o'};
            obj.reverseString(s);
            System.out.println(s);
        }
}
