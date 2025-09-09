package queues;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super(); //calls CircularQueue()
    }

    public DynamicQueue(int size) {
        super(size); //calls CircularQueue(int size)
    }

    //In insert method, we need to check if queue is full, if full then create a new array with double size and copy the elements from old array to new array and then point data to new array.
    //For that we can @Override insert method of CircularQueue class.

    @Override
    boolean insert(int value) {
        //take care if array is full
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            //copy the elements from old array to new array
            for (int i = 0; i < size; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            data = temp; //point data to new array
            front = 0;
            end = size;
        }

        //now we can insert the value
        return super.insert(value); //calls insert method of CircularQueue class
    }
}
