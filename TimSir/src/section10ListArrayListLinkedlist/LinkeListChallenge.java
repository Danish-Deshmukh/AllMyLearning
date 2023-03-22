package section10ListArrayListLinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s is %dkm away", name, distance);
    }
}

public class LinkeListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var itrator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {

            if (!itrator.hasPrevious()) {
                System.out.println("Orignating : " + itrator.next());
                forward = true;
            }
            if (!itrator.hasNext()) {
                System.out.println("Final : " + itrator.previous());
                forward = false;
            }
            System.out.println("Enter value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);


            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {
                        forward = true;
                        if (itrator.hasNext()) {
                            itrator.next();
                        }
                    }
                    if (itrator.hasNext()) {
                        System.out.println(itrator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if (forward) {
                        forward = false;
                        if (itrator.hasPrevious()) {
                            itrator.previous();
                        }
                    }
                    if (itrator.hasPrevious()) {
                        System.out.println(itrator.previous());
                    }
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;
                case "Q":
                    quitLoop = true;
                    break;
                default:
                    System.out.println("Please enter the right key");
                    break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            Place listPlace = list.get(i);
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available action (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
