package Algorithms.BinarySearch.Questions;

public class Q1CeilingOfANumber {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling (int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        if (target > arr[end]){
            System.out.println("can't found");
            return -1;
        }
        boolean ascendingOrDescending = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) /2;

            if (arr[mid] == target){
                return mid;
            }
            if (ascendingOrDescending){ // IF array is in ascending order

                if (arr[mid] > target){
                    end = mid-1;
                }
                else
                    start = mid+1;
            }
            else {              // IF array is in descending order

                if (arr[mid] < target){
                    end = mid-1;
                }
                else
                    start = mid+1;

            }
        }
        System.out.print("Ceiling of ARray is ");
        return arr[start];
    }
}
