package section14Lambda.Lambda1Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firtName, String lastName){

        @Override
        public String toString() {
            return firtName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> friends = new ArrayList<>(Arrays.asList(
                new Main.Person("Ross","Geller"),
                new Person("Monika","Geller"),
                new Person("Joe","Tribbiani"),
                new Person("Rachel","Green"),
                new Person("Phebe","unknown")));

        // Using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };
        System.out.println("--------");
        friends.sort((o1,o2) -> o1.lastName.compareTo(o2.lastName));
        System.out.println(friends);
        System.out.println("--------");

        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var ComparatorMixed = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firtName.compareTo(o2.firtName);
            }
        };
        friends.sort(ComparatorMixed);
        System.out.println(friends);
    }
}
