package Algorithms.LinearSearch;

public class Q2SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, -21, -1, -2, -3};
        int ans = range(arr, 5, 7, -1);
        System.out.println(ans);
        boolean ans1 = range1(arr, 5, 7, -1);
        System.out.println(ans1);
    }

    static int range(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Using ture false
    static boolean range1(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
