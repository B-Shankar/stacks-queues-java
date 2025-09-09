package queues;

public class Main {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(35);
        queue.insert(10);
        queue.insert(25);
        queue.insert(11);
        queue.insert(7);

        queue.insert(1);

        System.out.print("Queue: ");
        queue.display();
        System.out.println();

        try {
            System.out.println("Removed: " + queue.remove());
            System.out.println("Removed: " + queue.remove());
            System.out.println("Front: " + queue.front());
            System.out.print("Queue: ");
            queue.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
