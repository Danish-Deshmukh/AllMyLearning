package stacks_n_queues;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (isFull()) {
            // double the size of the array
            int[] temp = new int[data.length * 2];

            // copying the small array to the double size array we created
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
        return super.push(item);
    }
}
