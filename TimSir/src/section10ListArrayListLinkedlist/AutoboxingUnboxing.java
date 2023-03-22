package section10ListArrayListLinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);
        Integer deprecatedBox = 15;

        Double resultBoxed = getLiteralDoublePrimitive();
        Double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 21;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] charactersArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(charactersArray));


        var ourList = List.of(12, 32, 213, 123, 23, 123, 23, 12, 323, 23);
        System.out.println(ourList);
    }
    public static ArrayList<Integer> getList(int... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
    public static int returnAnInt(Integer i) {
        return i;
    }
    public static Integer returnAnInteger(int i) {
        return i;
    }
    public static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }
    public static Double getLiteralDoublePrimitive() {
        return 100.00;
    }
}
