package stacks;

import stacks.exception.StackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int pointer = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return pointer == data.length - 1;
    }

    private boolean isEmpty() {
        return pointer == -1;
    }

    boolean push(int value) {
        if (isFull()) {
            return false;
        }
        pointer++;
        data[pointer] = value;
        return true;
    }

    int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("cannot pop from an empty stack!");
        }
//        int removed = stack[pointer];
//        pointer--;
//        return removed;

        return  data[pointer--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("cannot peek from an empty stack!");
        }
        return data[pointer];
    }
}
