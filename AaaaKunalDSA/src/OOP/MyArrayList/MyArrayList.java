package OOP.MyArrayList;

public class MyArrayList<T> {
    private Object[] data;
    private static int INITAL_CAPACITY = 10;
    private int size = 0;

    public MyArrayList() {
        data = (T[]) new Object[INITAL_CAPACITY];
    }

//    public MyArrayList(int capacity) {
//        data = new int[capacity];
//    }

    public void add(T element) {
        ensureCapacity();
        data[size++] = (T) element;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
        data[index] = (T) element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }
    private void ensureCapacity() {
        if (size == data.length) {
            T[] newData = (T[]) new Object[2 * data.length];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(32);
//        System.out.println(Arrays.toString());

    }

}

