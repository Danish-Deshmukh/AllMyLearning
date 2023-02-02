package Algorithms.BinarySearch.SearchInMatrix;

import java.util.Arrays;

public   class LinearSearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,41,2,1},
                {1,2,3,4,3,2},
                {7,8,5,3,2}
        };
        int target = 8;
        int[] ans=  search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr, int target){

        int[] result = {-1,-1};

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target){

                    result = new int[]{row, col};
                    return result;
                }
            }
        }
        return result;
    }

}