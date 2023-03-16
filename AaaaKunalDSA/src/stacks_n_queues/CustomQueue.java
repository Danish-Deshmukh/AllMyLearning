package stacks_n_queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_VALUE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_VALUE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) { 
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display() {
        System.out.print("[");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]);
            if (i < end-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }
}
