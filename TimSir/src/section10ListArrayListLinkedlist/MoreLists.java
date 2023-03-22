package section10ListArrayListLinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples","bananas","milk","eggs"};

//        List<String> list = List.of(items);
//        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(List.of(items));
        groceries.add("yogurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","musterd","cheese"));

        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);

        groceries.addAll(List.of("apples","milk","mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<ArrayList<String>> multiDList = new ArrayList<>();
        System.out.println(multiDList);
    }
}
