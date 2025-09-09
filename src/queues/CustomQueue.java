package queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    boolean insert(int value) {
        if (isFull()) {
            return false;
        }

        data[end++] = value;
        return true;
    }

    int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        //shift the elements to left by 1
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return removed;
    }

    int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return data[0];
    }

    void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
