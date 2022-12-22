package KunalKushwaha.BinarySearch;

import java.util.Arrays;

public class UsingJavaInternalMethod {
    public static void main(String[] args) {
        int[] arr = {-114, -112, -12, -3,-2, -1, 0, 1, 2, 3, 4, 5, 7,8,9,12,42};
        int key = 5;

        int result = Arrays.binarySearch(arr,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);

    }
}
