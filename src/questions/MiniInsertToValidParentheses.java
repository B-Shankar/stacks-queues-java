package questions;

//1541. Minimum Insertions to Balance a Parentheses String
public class MiniInsertToValidParentheses {
    public int minInsertions(String s) {
        int insertions = 0;
        int balance = 0; // Tracks the number of unmatched '('

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                balance++;
            } else { // ch == ')'
                if (balance > 0) {
                    balance--; // Match with a previous '('
                } else {
                    insertions++; // Need an extra '('
                }

                // Check for the next character to see if it's also ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; // Skip the next ')'
                } else {
                    insertions++; // Need an extra ')' to complete the pair
                }
            }
        }

        // Each unmatched '(' needs two ')' to balance
        insertions += balance * 2;

        return insertions;
    }

    public static void main(String[] args) {
        MiniInsertToValidParentheses solution = new MiniInsertToValidParentheses();
        String s = "(()))"; // Example input
        int result = solution.minInsertions(s);
        System.out.println("Minimum insertions needed: " + result); // Output the result
    }
}
