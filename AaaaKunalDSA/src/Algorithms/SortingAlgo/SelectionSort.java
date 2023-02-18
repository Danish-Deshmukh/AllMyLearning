package Algorithms.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2 };
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void selectionSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int minIndex = getMin(arr,start,arr.length-1);
            swap(arr,minIndex,start);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static int getMin (int[] arr, int start ,int end){
        int min = end;
        for (int i = start; i <= end ; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
}

