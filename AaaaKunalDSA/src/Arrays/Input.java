package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        arr[0] = 55;
        arr[1] = 51;
        arr[2] = 52;
        arr[3] = 53;
        arr[4] = 54;
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println("Enter array");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
