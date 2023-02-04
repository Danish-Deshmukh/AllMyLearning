package Algorithms.SearchingAlgo;

import java.util.Arrays;

import static Algorithms.SearchingAlgo.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
    }
}
