package queues;

public class CircularQueue {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    boolean insert(int value) {
        if (isFull()) {
            return false;
        }

        data[end++] = value;
        end = end % data.length; //circular increment
        size++;
        return true;
    }

    int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length; //circular increment
        size--;
        return removed;
    }

    int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return data[front];
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % data.length] + " -> ");
        }
        System.out.println("END");
    }
}
