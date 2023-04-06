package section14Lambda.Lambda4Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    public static void main(String[] args) {

//        List<String> firstNames = new ArrayList<>(List.of("BoB", "AnNa", "DaNiSh"));

        String[] names = {"Bob", "Hannah", "AnnA", "DaiNsh", "Deshmukh"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("--> transform to upperCase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("--> ");
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
                s.substring(s.lastIndexOf(" ") + 1)));

        System.out.println("---> Final result");
        System.out.println(newList);
        newList.forEach(s -> System.out.println(s));

    }
    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }
    public static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}
