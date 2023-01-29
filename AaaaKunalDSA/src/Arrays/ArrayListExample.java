package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
            if (i < 4){
                System.out.print(", ");
            }

        }
        System.out.println("]");
        System.out.println(list);

//        System.out.println(list.contains(5));
//        System.out.println(list.get(1));
//        list.set(8,10);
//        System.out.println(list.get(8));
//        list.remove(2);
//
//        System.out.println(list);
    }
}
