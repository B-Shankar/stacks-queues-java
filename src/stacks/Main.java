package stacks;

import stacks.exception.StackException;

public class Main {
    public static void main(String[] args) throws StackException {
//        customStack();

        dynamicStack();
    }

    static void customStack() throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.print("Stack: ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(stack.data[i] + " ");
        }
        System.out.println();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Uncommenting the following line will throw StackException
        //System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }

    static void dynamicStack() throws StackException {
        //DynamicStack stack = new DynamicStack(5); // we can also create object of DynamicStack without size as it has default constructor
        //OR
        //CustomStack stack = new DynamicStack(5);
        //OR
        CustomStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // this will be added successfully as stack is dynamic
        stack.push(70); // this will be added successfully as stack is dynamic

        System.out.print("Stack: ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(stack.data[i] + " ");
        }
        System.out.println();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());


        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
