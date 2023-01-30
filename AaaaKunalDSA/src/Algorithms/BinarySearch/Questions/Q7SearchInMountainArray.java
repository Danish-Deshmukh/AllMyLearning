package Algorithms.BinarySearch.Questions;

public class Q7SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,4,2,1,0};
        int search = mountainSearch(arr,0);
        System.out.println(search);
    }
    static int mountainSearch (int[]arr, int target){
        if (arr.length == 0){
            return -1;
        }
        int peak = peakIndexInMountainArray(arr);
        int fist = oABS(arr,target,0,peak);
        if (fist != -1){
            return fist;
        }
        return oABS(arr,target,peak,arr.length-1);
    }
    static public int peakIndexInMountainArray(int[] arr) {

        int start = 0 ;
        int end = arr.length-1;

        while (start < end ){

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int oABS(int[] arr, int target,int start ,int end) {
        
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
