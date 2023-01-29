package Algorithms.BinarySearch;

public class BinarySearchCode {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,5));

    }
    static int binarySearch (int[]arr, int target){

        int start = 0;
        int end = arr.length-1;

            while (start <= end){

                int mid = start + (end - start) /2;

                if (arr[mid] > target){
                    end = mid-1;
                }
                if (arr[mid] < target){
                    start = mid+1;
                }
                else
                    return mid;
        }
        return -1;
    }
}
