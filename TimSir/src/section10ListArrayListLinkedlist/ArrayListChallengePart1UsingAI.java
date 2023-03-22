package section10ListArrayListLinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListChallengePart1UsingAI {
    private static ArrayList<String> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> showList();
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to shut down\n" +
                "1 - to add item(s) to list\n" +
                "2 - to remove any item\n" +
                "3 - to show item in the list");
    }

    public static void addItem() {
        System.out.print("Enter the grocery item: ");
        String item = scanner.nextLine();

        if (list.contains(item)) {
            System.out.println(item + " is already in the grocery list.");
        } else {
            list.add(item);
            Collections.sort(list);
            System.out.println(item + " has been added to the grocery list.");
            showList();
        }
    }

    public static void removeItem() {
        System.out.print("Enter the grocery item to remove: ");
        String item = scanner.nextLine();
        if (list.contains(item)) {
            list.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
            showList();
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    public static void showList() {
        System.out.println("Grocery list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
