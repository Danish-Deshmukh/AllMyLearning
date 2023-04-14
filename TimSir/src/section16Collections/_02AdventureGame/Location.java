package section16Collections._02AdventureGame;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> ways;

    public Location(int locationID, String description, Map<String, Integer> ways) {
        this.locationID = locationID;
        this.description = description;
        if (ways != null) {
            this.ways = new HashMap<String, Integer>(ways);
        }else {
            this.ways = new HashMap<String, Integer>();
        }
        this.ways.put("Q",0);
    }

    public Map<String, Integer> getWays() {
        return ways;
    }

    public void addway(String direction, int location) {
        ways.put(direction, location);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
}
