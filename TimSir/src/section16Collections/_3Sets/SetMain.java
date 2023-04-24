package section16Collections._3Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i<=100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println(union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println(intersection);

        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }



        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrayNatureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(arrayNatureWords));
        System.out.println(nature);

        String[] dvivineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(dvivineWords));
        System.out.println(divine);

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        System.out.println(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        System.out.println(diff2);

        System.out.println("and intersection ");
        Set<String> diff3 = new HashSet<>(divine);
        diff3.retainAll(nature);
        System.out.println(diff3);

        System.out.println("all together");
        Set<String> union1 = new HashSet<>(divine);
        union1.addAll(nature);
        System.out.println(union1);

        System.out.println("symmetric difference");
        union1.removeAll(diff3);
        System.out.println(union1);

    }
}
