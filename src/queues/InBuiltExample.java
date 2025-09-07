package queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    //Queue is an interface that extends Collection interface
    //It is FIFO data structure
    //Java provides several classes that implement the Queue interface, including LinkedList, PriorityQueue,
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(3);
        queue.offer(15);
        queue.offer(8);
        queue.offer(5);
        queue.offer(26);

        System.out.println("Queue: " + queue);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        System.out.println("Add element 42: " + queue.add(42));
        System.out.println("Removed element: " + queue.remove()); //remove() throws exception if we remove from empty queue

        //poll() returns null if we poll from empty queue
        System.out.println();
        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.poll());
        }
    }
}
