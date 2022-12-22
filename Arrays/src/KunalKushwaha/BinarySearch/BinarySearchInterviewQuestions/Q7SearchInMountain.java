package KunalKushwaha.BinarySearch.BinarySearchInterviewQuestions;

public class Q7SearchInMountain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,3,2,1};
        System.out.println(searchInMountain(arr,3));

    }


    public static int searchInMountain(int[] arr, int target) {

        int peak = peakIndexMountain(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexMountain(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;// Or return end , because both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean ifAse;
        ifAse = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ifAse) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
