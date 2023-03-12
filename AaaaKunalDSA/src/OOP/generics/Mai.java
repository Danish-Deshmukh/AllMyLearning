package OOP.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Mai {
    public static void main(String[] args) {

        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(32);
        list.add(33);
        list.add(22);
        list.add(11);
        list.add(0);


        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.size());
        list.insert(1, 33);
        list.insert(1, 2222);
        System.out.println(list);
        System.out.println(list.get(4));
//        list.get(0);
//        list.set(1,455);
//        list.size();
//        list.isEmpty();


        LinkedList<Integer> listL = new LinkedList<>();
        listL.add(21);
        listL.add(2);
        listL.add(1);
        listL.add(221);


        ArrayList<Integer> list1 = new ArrayList<>();


//        list.add(210);
//        list.add(21);
//        list1.remove(0);
//        System.out.println(list);

        Vector<Integer> listV = new Vector<>(12);

    }
}
