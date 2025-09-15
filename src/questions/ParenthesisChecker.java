package questions;

import java.util.Stack;

//Valid Parentheses in an Expression
//20. Valid Parentheses
public class ParenthesisChecker {
    public static boolean isBalanced(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {

                // No opening bracket
                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }

                // Pop matching opening bracket
                st.pop();
            }
        }

        // Balanced if stack is empty
        return st.isEmpty();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                } else if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println((isBalanced(s) ? "true" : "false"));

        System.out.println("[{] : " + isValid("[{]"));
    }
}