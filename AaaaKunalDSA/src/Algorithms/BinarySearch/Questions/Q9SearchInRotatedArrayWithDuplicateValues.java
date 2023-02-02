package Algorithms.BinarySearch.Questions;

public class Q9SearchInRotatedArrayWithDuplicateValues {
    public static void main(String[] args) {
        int[] arr = {2,2,9,2,2,2,2};
        System.out.println(sRSA(arr,2));
    }
    static int sRSA(int[] arr, int target) {

        int peak = peakForDuplicateAlso(arr);

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
    static int peakForDuplicateAlso(int[] arr) {
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
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){

                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else {
                end= mid-1;
            }
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
