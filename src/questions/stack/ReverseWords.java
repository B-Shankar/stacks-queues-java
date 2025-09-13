package questions.stack;

import java.util.Stack;

//Reverse individual words: GFG
public class ReverseWords {
    static String reverseWords(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (!st.isEmpty()) {
                    result.append(st.pop());
                }
                result.append(" ");
            }
        }

        // Reverse the last word (if there's no space after it)
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String reversed = reverseWords(str);
        System.out.println(reversed);
    }
}
