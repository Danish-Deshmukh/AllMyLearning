package stacks_n_queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty Stack");
        }
        int temp = data[ptr];
        ptr--;
        return temp;
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Don't have peek from an empty Stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        if (ptr == (data.length - 1)) return true;
        else return false;
    }
    public boolean isEmpty() {
        if (ptr == -1) return true;
        else return false;
    }
}
