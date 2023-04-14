package section16Collections._01CollectionsOverview;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","a compiled high level , syntax heavy ");
        languages.put("Python","a very high level language");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }else languages.put("Java","Java is added");
        System.out.println(languages.put("Java","something something"));

        System.out.println(languages.put("Kotlin","For android"));

        System.out.println(languages.get("Java"));

        System.out.println("=".repeat(30));

        languages.remove("Kotlin");
        languages.replace("Python","It is hard to learn");


        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
