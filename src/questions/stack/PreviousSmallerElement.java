package questions.stack;

import java.util.ArrayList;
import java.util.Stack;


//Previous Smaller Element: GFG
class PreviousSmallerElement {
    //Using Stack
    static ArrayList<Integer> prevSmallerWithStack(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        // initialize all as -1
        for (int i = 0; i < n; i++) result.add(-1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // pop elements from stack until a smaller
            // element is found or stack becomes empty
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // if stack is not empty, top is nearest smaller
            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            // push current element to stack
            st.push(arr[i]);
        }
        return result;
    }

    //Using ArrayList
    ArrayList<Integer> prevSmaller(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        // initialize all as -1
        for (int i = 0; i < n; i++) result.add(-1);

        // for each element, check all elements
        // on the left
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    result.set(i, arr[j]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 3, 4, 5};
        ArrayList<Integer> ans = prevSmallerWithStack(arr);

        for (int x : ans) System.out.print(x + " ");
    }
}