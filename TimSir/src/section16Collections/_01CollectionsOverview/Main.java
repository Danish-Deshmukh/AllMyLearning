package section16Collections._01CollectionsOverview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Aakash", 8, 12);

//        if(theatre.reserveSeat("D12")) {
//            System.out.println("Please pay for D12");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//
//        if(theatre.reserveSeat("D12")) {
//            System.out.println("Please pay for D12");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//
//        if(theatre.reserveSeat("B13")) {
//            System.out.println("Please pay for B13");
//        } else {
//            System.out.println("Seat already reserved");
//        }

//        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
//        Collections.reverse(reverseSeats);
//        printList(reverseSeats);


        Iterable<Integer> list = new ArrayList<>();
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
//        priceSeats.add(theatre.new Seat("B00", 13));
//        priceSeats.add(theatre.new Seat("A00", 13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

//    public static void printList(List<Theatre.Seat> list) {
//        for(Theatre.Seat seat : list) {
//            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
//        }
//        System.out.println();
//        System.out.println("======================================================================");
//    }

    public static void printList(List<Theatre.Seat> list) {
        char some = 'B'; // For changing line when a row finishes
        for (int i = 0; i < list.size(); i++) {
            Theatre.Seat seat = list.get(i);
            if (seat.getSeatNumber().charAt(0) == some) {
                System.out.println();
                some++;
            }

//            System.out.print(" " + seat.getSeatNumber() +" "  + seat.getPrice()+ "$ -");
            System.out.printf(" %s %02d$ -",seat.getSeatNumber(),seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
//    public Collection<Seat> getSeats() {
//        char some = 'B'; // For changing line when a row finishes
//        for (int i = 0; i < seats.size(); i++) {
//            Seat seat = seats.get(i);
//
//            if (seat.getSeatNumber().charAt(0) == some) {
//                System.out.println();
//                some++;
//            }
//            System.out.print(seat.getSeatNumber() + " ");
//        }
//        System.out.println();
//        return seats;
//    }
}
