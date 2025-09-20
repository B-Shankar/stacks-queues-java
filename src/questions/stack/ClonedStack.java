package questions.stack;

import java.util.*;

//Clone a Stack without using extra space: GFG
class ClonedStack {

    //Reverse The Stack - O(n ^ 2) Time and O(1) Space
    static void clonedStack(Stack<Integer> st, Stack<Integer> cloned) {

        int count = 0;

        // reverse the order of the values in source stack
        while(count != st.size() - 1) {
            int topVal = st.peek();
            st.pop();
            while(count != st.size()) {
                cloned.push(st.peek());
                st.pop();
            }
            st.push(topVal);
            while(cloned.size() != 0) {
                st.push(cloned.peek());
                cloned.pop();
            }
            count += 1;
        }

        // pop the values from source and
        // push into destination stack
        while(st.size() != 0) {
            cloned.push(st.peek());
            st.pop();
        }
    }

    //Using Recursion - O(n) Time and O(n) Space for Recursion Call Stack
    static void clonedStackUsingRecursion(Stack<Integer> st, Stack<Integer> cloned) {

        // If the source stack is empty, return.
        if (st.empty())
            return;

        // Pop an element from the source stack.
        int temp = st.peek();
        st.pop();

        // Recursively clone the remaining elements.
        clonedStack(st, cloned);

        // Push the popped element to the cloned stack.
        cloned.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> source = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        source.push(1);
        source.push(2);
        source.push(3);

        System.out.println("Source Stack:");
        Stack<Integer> temp = (Stack<Integer>) source.clone();
        while(!temp.empty()) {
            System.out.print(temp.peek() + " ");
            temp.pop();
        }
        System.out.println();

        clonedStack(source, dest);

        System.out.println("Destination Stack:");
        while(!dest.empty()) {
            System.out.print(dest.peek() + " ");
            dest.pop();
        }
    }
}