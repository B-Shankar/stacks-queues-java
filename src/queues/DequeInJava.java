package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInJava {

    //Deque is a double ended queue that allows insertion and deletion from both ends
    //It is implemented using LinkedList or ArrayDeque class in Java
    //It is a linear collection that supports element insertion and removal at both ends
    //It is not thread-safe
    //It is an interface that extends Queue interface

    //ArrayDeque is faster than LinkedList but it has a fixed size
    //LinkedList is slower than ArrayDeque but it has a dynamic size

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //Adding elements at both ends
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);
        System.out.println("Deque: " + deque);

        //Accessing elements at both ends
        System.out.println();
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        System.out.println("First element (peek): " + deque.peekFirst());
        System.out.println("Last element (peek): " + deque.peekLast());

        //Removing elements at both ends
        System.out.println();
        System.out.println("Removed first element: " + deque.removeFirst());
        System.out.println("Removed last element: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
        System.out.println("Removed first element (poll): " + deque.pollFirst());
        System.out.println("Removed last element (poll): " + deque.pollLast());
        System.out.println("Deque after poll removals: " + deque);

        //Size of the deque
        System.out.println();
        System.out.println("Size of deque: " + deque.size());

        //Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        //Clear the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}
