package OOP.generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private int size = 0;
    int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size] = num;
        size = size + 1;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = 0;
        size--;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public void insert(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound");
        }
        if (isFull()) {
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public String toString() {
        return Arrays.toString(data);
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = (T)(data[i]);
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
}
