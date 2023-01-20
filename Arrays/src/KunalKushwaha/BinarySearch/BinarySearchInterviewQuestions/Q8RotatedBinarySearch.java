package KunalKushwaha.BinarySearch.BinarySearchInterviewQuestions;

public class Q8RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(findPivot(arr));
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] numb, int target) {
        int pivot = findPivot(numb);

        if (pivot == -1) {
            return binarySearch(numb, target, 0, numb.length - 1);
        }
        // case 1
        if (numb[pivot] == target) {
            return pivot;
        }
        // case 2
        if (target >= numb[0]) {
            return binarySearch(numb, target, numb[0], pivot - 1);
        }
        // case 3
        return binarySearch(numb, target, pivot + 1, numb.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2 ; // might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // 4 cases ( In practic book )

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3
            if (arr[mid] <= start) {
                end = mid - 1;
            }
            // case 4
            else {
                return start = mid + 1;
            }
        }
        return -1;
    }
}
