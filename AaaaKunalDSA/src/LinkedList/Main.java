package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(11);
        list.insertLast(121);
        list.insertLast(221);
        list.insertLast(321);
        list.insertLast(421);
        list.insertLast(251);
        list.insertLast(261);
        list.insertLast(271);
        list.insertLast(218);
        list.insertLast(219);
        list.insertLast(21);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();

        LinkedList<Integer> oL = new LinkedList<>();
//        oL.addFirst(31);
//        oL.add(12);
//        oL.addLast(21);
//        oL.size();
//        oL.notify();
//        Integer i = 12;
//        oL.add(23,12);

    }
}
