package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int [3][3];

        arr[0][0] = 33;
        arr[0][1] = 22;
        arr[2][2] = 88;

        int [][] arr2D = new int[3][3];
//                arr2D= {
//                {1, 2, 3}, // arr2D[0][0] = 1,    arr2D[0][1] = 2,
//                {4, 5},
//                {6, 7, 8, 9} // arr2D[2][2] = 8,
//        };
//        System.out.println(arr2D[0][0]);
//        System.out.println(arr2D[0][1]);
//        System.out.println(arr2D[2][2]);

        System.out.println("enter a arrrya ");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D [i][j] = scanner.nextInt();
            }
        }
        System.out.println(" OUt put iz");

        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));

//            for (int j = 0; j < arr2D[i].length; j++) {
//                System.out.print(arr2D[i][j] +" ");
//            }
//            System.out.println();
        }
    }
/*
for (int i = 0; i < arr2D.length; i++) {

            System.out.println(Arrays.toString(arr2D[i]));
 */
}
