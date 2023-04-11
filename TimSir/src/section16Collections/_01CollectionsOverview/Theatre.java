package section16Collections._01CollectionsOverview;

import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();
    static  Comparator<Seat> PRICE_ORDER ;

//    static {
//        PRICE_ORDER = new Comparator<Seat>() {
//            @Override
//            public int compare(Seat seat1, Seat seat2) {
//                if (seat1.getPrice() < seat2.getPrice()) {
//                    return -1;
//                } else if (seat1.getPrice() > seat2.getPrice()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        };
//    }
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                int price = 12;

                if((row < 'D') && (seatNum >=4 && seatNum <=9)) {
                    price = 14;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {

        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }
    public Collection<Seat> getSeats1() {
        char some = 'B'; // For changing line when a row finishes
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i);

            if (seat.getSeatNumber().charAt(0) == some) {
                System.out.println();
                some++;
            }
            System.out.print(seat.getSeatNumber() + " ");
        }
        System.out.println();
        return seats;
    }

    public class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private Integer price;
        private boolean reserved = false;

        public Seat(String seatNumber, Integer price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

         String getSeatNumber() {
            return seatNumber;
        }

        public Integer getPrice() {
            return price;
        }
    }
}
