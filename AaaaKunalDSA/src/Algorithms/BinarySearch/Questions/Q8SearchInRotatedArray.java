package Algorithms.BinarySearch.Questions;

public class Q8SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] ar1 = {7, 0, 1, 2, 3, 5, 6};
        int[] ar2 = {1, 2};

        int[] ar3 = {3, 5, 1};

        int target = 3;
        System.out.println(sRSA(ar3, target));

        System.out.println("FInding pivot");
        System.out.println(peak(arr));
        System.out.println(peak(ar1));
        System.out.println(peak(ar2));

        System.out.println("Searching ");
        System.out.println(sRSA(arr, target));
        System.out.println(sRSA(ar1, target));
        System.out.println(sRSA(ar2, target));

    }

    static int sRSA(int[] arr, int target) {

        int peak = peak(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (peak == -1) {
            /// then use simple binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[peak] == target) {
            return peak;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, peak - 1);
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peak(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
