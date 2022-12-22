package TimBachaka.MobilePhone;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int [] [] arr = {
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(list);
//        list.add(343);
//        list.add(323);
//        list.add(333);
//
//        System.out.println(list);
//        list.set(0,3235);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.add(0,3235);
//        System.out.println(list);
//
//        System.out.println(list.contains(323));
//        System.out.println(list.contains(3235));
    }
}
