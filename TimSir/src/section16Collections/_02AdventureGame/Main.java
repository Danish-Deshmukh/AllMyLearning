package section16Collections._02AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempWay = new HashMap<String, Integer>();
        locations.put(0,new Location(0,"You are sitting in front of a computer learning java", null));

        tempWay = new HashMap<String, Integer>();
        tempWay.put("W",2);
        tempWay.put("N",5);
        tempWay.put("E",3);
        tempWay.put("S",4);
        locations.put(1,new Location(1,"You are standing at the end of a road before a small brick building", tempWay));
        
        
        tempWay = new HashMap<String, Integer>();
        tempWay.put("N",5);
        locations.put(2,new Location(2,"You are at the top of a hill", tempWay));
        
        
        tempWay = new HashMap<String, Integer>();
        tempWay.put("W",1);
        locations.put(3,new Location(3,"You are inside a building, a well house for a small spring", tempWay));
        
        
        tempWay = new HashMap<String, Integer>();
        tempWay.put("N",1);
        tempWay.put("W",2);
        locations.put(4,new Location(4,"You are in a valley beside a stream", tempWay));
        
        
        tempWay = new HashMap<String, Integer>();
        tempWay.put("S",1);
        tempWay.put("W",2);
        locations.put(5,new Location(5,"You are in the forest", tempWay));
        
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("EXIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");

        int loc = 1; // Current Location

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            tempWay.remove("S");

            if (loc == 0) {
                break;
            }

            Map<String, Integer> ways = locations.get(loc).getWays();
            System.out.print("Available ways are ");
            for (String way : ways.keySet()) {
                System.out.print(way + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (ways.containsKey(direction)) {
                loc = ways.get(direction);
            }
            else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
