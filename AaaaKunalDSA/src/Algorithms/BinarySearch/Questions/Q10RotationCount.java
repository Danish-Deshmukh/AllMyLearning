package Algorithms.BinarySearch.Questions;

public class Q10RotationCount {
    public static void main(String[] args) {
//        int[] arr = {2,2,9,2,2,2,2};
        int[] arr = {1,2,3,4};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount (int[] arr){

        int peak = peakForDuplicateAlso(arr);
     return peak+1;
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
}
