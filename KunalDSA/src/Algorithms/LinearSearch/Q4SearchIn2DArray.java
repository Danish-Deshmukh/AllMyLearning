package Algorithms.LinearSearch;

import java.util.Arrays;

public class Q4SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 56, 7, 8, 9},
                {12, 31, 45, 75, 343}
        };
        System.out.println(Arrays.toString(search(arr, 45)));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int cloum = 0; cloum < arr[row].length; cloum++) {

                if (arr[row][cloum] == target) {
                    return new int[]{row, cloum};
                }
            }
        }


        return new int[]{-1, -1};
    }

    // Using True and False
    static boolean search1(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int cloum = 0; cloum < arr[row].length; cloum++) {
                if (arr[row][cloum] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
