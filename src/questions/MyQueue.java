package questions;

import java.util.Stack;

//232. Implement Queue using Stacks
class MyQueue {
    /************This is INSERT EFFICIENT QUEUE*************/
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        try {
            System.out.println(queue.peek());  // returns 1
            System.out.println(queue.pop());   // returns 1
            System.out.println(queue.empty()); // returns false
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class QueueUsingStacks {
    /************ This is REMOVE EFFICIENT QUEUE *************/
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // O(n)
    public void add(int x) {
        // Move everything to second
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // Push new element
        first.push(x);

        // Move everything back
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    // O(1)
    public int remove() throws Exception {
        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.pop();
    }

    // O(1)
    public int peek() throws Exception {
        if (first.isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.add(1);
        queue.add(2);
        try {
            System.out.println(queue.peek());  // returns 1
            System.out.println(queue.remove()); // returns 1
            System.out.println(queue.isEmpty()); // returns false
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}