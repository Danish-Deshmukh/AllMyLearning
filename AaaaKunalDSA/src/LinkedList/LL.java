package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public void insertFist(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFist(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void addInPosition(int index,int val) {
        if (index == 0) {
            insertFist(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public void display() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private static final class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
