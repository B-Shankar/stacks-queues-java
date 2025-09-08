package stacks;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); //calls CustomStack()
    }

    public DynamicStack(int size) {
        super(size); //calls CustomStack(int size)
    }

    //In push method, we need to check if stack is full, if full then create a new array with double size and copy the elements from old array to new array and then point data to new array.
    //For that we can @Override push method of CustomStack class.

    @Override
    boolean push(int value) {
        //take care if array is full
        if (this.isFull()) {
            int[] temp = new int[this.data.length * 2];

            //copy the elements from old array to new array
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }

            this.data = temp; //point data to new array
        }

        //now we can push the value
        return super.push(value); //calls push method of CustomStack class
    }
}
