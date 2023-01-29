package Algorithms.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr1 = {8, 7, 5, 4, 3, 2, 1, -1};
        System.out.println(oABS(arr,8));
        System.out.println(oABS(arr1, 4));
    }
    static int oABS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else
                    return mid;
            }
        } else {
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else
                    return mid;
            }
        }
        return -1;
    }
}
