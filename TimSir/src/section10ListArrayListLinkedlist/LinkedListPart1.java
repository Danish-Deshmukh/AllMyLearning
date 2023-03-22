package section10ListArrayListLinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPart1 {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Maharashtra");
        placesToVisit.add("Pachora");
        placesToVisit.add("Aauragabad");
        placesToVisit.add("Khuldabad");
        placesToVisit.add("Daultabad");
        placesToVisit.add("Panchakki");
        placesToVisit.add("Mukbera");
        placesToVisit.add("RaniGardan");

//        printItinerary(placesToVisit);
//        System.out.println();
//        printItinerary1(placesToVisit);
//        System.out.println();
//        printItinerary2(placesToVisit);
//        System.out.println();
        testIterator(placesToVisit);
    }
    public static void printItinerary(LinkedList<String> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Trip start at " + list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> from: " + list.get(i - 1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
    }
    public static void printItinerary1(LinkedList<String> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Trip start at " + list.getFirst());

        String priviousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + priviousTown + " to " + town);
            priviousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Trip start at " + list.getFirst());

        String priviousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + priviousTown + "  to " + town);
            priviousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }
    public static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Pachora")) {
                iterator.add("papaya");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
