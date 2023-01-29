package Algorithms.BinarySearch.Questions;

import java.util.Arrays;

public class Q4FistAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {5,5,5,5,5,5,5,6,6,6,6,6};
        System.out.println(Arrays.toString(searchRange(arr, 5)));
    }


    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};


//        ans[0] = LinearSearch(nums, target, true);     // brute force solution
//        if (ans[0] != -1) {
//            ans[1] = LinearSearch(nums, target, false);
//        }

        ans[0] = binarySearch(nums, target, true);   //// logn solution
        if (ans[0] != -1){
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }
    static int binarySearch(int[] nums, int target, boolean startOrEnd) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end -start) / 2;

            if (nums[mid] > target){
                end = mid -1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else{
                ans = mid;
                if (startOrEnd){
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    static int LinearSearch(int[] arr, int target, boolean startOrEnd) {
        if (arr.length == 0) {
            return -1;
        }
        if (startOrEnd) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
