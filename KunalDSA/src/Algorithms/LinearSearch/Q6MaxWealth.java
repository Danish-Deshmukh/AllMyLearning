package Algorithms.LinearSearch;

public class Q6MaxWealth {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 2, 1},{1,2,3,4,5,5}};
        int[][] arr = {{1, 5},{7,3},{3,5}};
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr) {

        int max = Integer.MIN_VALUE;


        for (int[] array : arr) {

            int sum = 0;
            for (int element : array) {

                sum += element;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
