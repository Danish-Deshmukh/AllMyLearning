package Algorithms.SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion (int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j > 0; j--) {

                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
