package section10ListArrayListLinkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallengePart1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(21);
//        list1.add(12);
//        System.out.println(list1);
//        list1.remove(0);
//        System.out.println(list1);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        int input = scanner.nextInt();

        while (true) {

            System.out.println("Available actions :");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list ");
            System.out.println("2 - to remove any item ");
            System.out.println("3 - to show item in the list");
            System.out.println("Enter a number for which action you want to do:");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }
            else if (n == 1) {
                System.out.print("Enter item : ");
                list.add(scanner.nextInt());
                System.out.println(" Item added");
                System.out.println();
                System.out.println();
            }
            else if (n == 2) {
                System.out.println("Enter the index of the item");
                list.remove(scanner.nextInt());
                System.out.println("Item at that index is removed");
                System.out.println();
                System.out.println();
            }
            else if (n == 3) {
                System.out.print("List items are :");
                System.out.println(list);
                System.out.println();
                System.out.println();
            }
            else System.out.println("Enter only below actions");
        }
    }
}
/*

create a grocery list
Your grocery list should be an ArrayList
You should use methods on the Arraylist, to add items ,remove items, check if and item is already in the list, and print a sorted list.
You should print the list, sorted alphabetically, after each operation.
You shouldn't allow duplicate items in the list

"Available actions :
0 - to shut down
1 - to add item(s) to list
2 - to remove any item
3 - to show item in the list
Enter a number for which action you want to do:"



* */