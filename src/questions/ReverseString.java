package questions;

import java.util.Stack;

//Reverse a String using Stack
public class ReverseString {
    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        // Push all characters onto the stack
        for (char c : s.toCharArray())
            stack.push(c);
        // Pop characters to form reversed string
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}