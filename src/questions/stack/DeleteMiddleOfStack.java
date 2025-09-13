package questions.stack;

import java.util.ArrayList;
import java.util.Stack;

//Delete Middle element from stack: GFG
public class DeleteMiddleOfStack {
    public static void deleteMid(Stack<Integer> st, int size) {
        // Use an ArrayList to store stack elements
        ArrayList<Integer> v = new ArrayList<>();
        while (!st.isEmpty()) {
            v.add(st.pop());
        }

        // Find the middle index
        int mid = size / 2;

        // Remove the middle element
        v.remove(mid);

        // Push elements back to the stack
        for (int i = v.size() - 1; i >= 0; i--) {
            st.push(v.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();

        System.out.println("Input: " + st);

        deleteMid(st, size);

        System.out.print("Output: [");
        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
        System.out.println("]");
    }
}
