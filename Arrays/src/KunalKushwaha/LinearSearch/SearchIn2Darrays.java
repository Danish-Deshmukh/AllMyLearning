package KunalKushwaha.LinearSearch;
import java.util.Arrays;

class SearchIn2DArrays {

    public static void main(String[] args) {

        int [][] arr= {
                {1,3,4},
                {2,6,32,45},
                {12,51,34,-87},
                {18,12},
        };

        System.out.println("Minimum Item of the array is - "+searchForMinimum(arr));
        System.out.println("Maximum Item of the array is - "+searchForMaximum(arr));
        int target = 15;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search (int[][] arr, int target){

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        System.out.println("Not found error");
        return new int[]{-1,-1};
    }

    static int searchForMaximum (int[][] arr){

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    static int searchForMinimum(int[][] arr){

        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
