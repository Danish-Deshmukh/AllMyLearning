package TimBachaka;

import java.util.Arrays;

public class ReverceArrayChallenge {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(a));
        System.out.println("Array in Reverse");
        reverse(a);
        System.out.println("Reversed array = " + Arrays.toString(a));
    }
    private static void reverse(int[] array) {
        int maxIndex = (array.length - 1);
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
class Mai {
    public static void main(String[] args) {
        int[] newArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("The initial array is: " + Arrays.toString(newArray));
        reverse(newArray);
        System.out.println("The reversed array is: " + Arrays.toString(newArray));
    }
    private static void reverse(int[] array) { // pass in reference type variable pointing at the object in memory, newArray...so we modify newArray via array
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
class ReverseArray {
    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}