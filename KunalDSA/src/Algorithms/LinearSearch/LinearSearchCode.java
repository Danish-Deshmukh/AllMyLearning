package Algorithms.LinearSearch;

public class LinearSearchCode {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,-21,-1,-2,-3};

        int target = -3;

        System.out.println(LinearSearch(arr,target));
        System.out.println(LinearSearch2(arr,target));
        System.out.println(LinearSearch3(arr,target));
    }

    // If you want to pint Index
    static int LinearSearch (int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // If you want to pint Element
    static int LinearSearch2 (int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
    // If you want to pint True or False
    static boolean LinearSearch3 (int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
