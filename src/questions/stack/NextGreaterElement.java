package questions.stack;

import java.util.ArrayList;
import java.util.Stack;

//Next Greater Element in Array: GFG
class NextGreaterElement {

    static ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1 for all elements
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        for (int i = n - 1; i >= 0; i--) {

            // Pop elements from the stack that are less
            // than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is not empty, the top element
            // is the next greater element
            if (!stack.isEmpty()) {
                result.set(i, stack.peek());
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        ArrayList<Integer> result = nextLargerElement(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}