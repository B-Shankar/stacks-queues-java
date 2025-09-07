package stacks;

import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        //Stack is a class that implements a last-in-first-out (LIFO) stack of objects.
        //It is Class Stack<E> extends Vector<E>
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        //EmptyStackException: if we pop from empty stack -> while (true)
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
