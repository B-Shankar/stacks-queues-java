package questions;

import java.util.Stack;

//921. Minimum Add to Make Parentheses Valid
public class ValidParenthesesMiniAdd {

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())")); // Output: 1
        System.out.println(minAddToMakeValid("(((")); // Output: 3
    }
}
