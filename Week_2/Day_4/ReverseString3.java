package Week_2.Day_4;

public class ReverseString3 {
     public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ' '){
                word.append(ch);
            }else{
                result.append(word.reverse());
                result.append(' ');
                word.setLength(0); // reset word
            }
        }

        //last word
        result.append(word.reverse());

        return result.toString();
     }

     public static void main(String args[]){

        String str = "Anshika is a good girl.";
        System.out.println(reverseWords(str));
     }
}
