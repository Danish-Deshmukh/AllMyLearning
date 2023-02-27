package Recursion.Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    static void quickSort(int[] arr, int lowIndex , int highIndex){
        if (lowIndex >= highIndex) {
            return;
        }
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr,pivotIndex,highIndex);

        int lP = partition(arr, lowIndex,highIndex,pivot);

        quickSort(arr, lowIndex,lP-1);
        quickSort(arr,lP+1,highIndex);
    }
    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot){
        int lP = lowIndex;
        int rP = highIndex;

        while (lP < rP) {

            while (arr[lP] <= pivot && lP < rP) {
                lP++;
            }
            while (arr[rP] >= pivot && lP < rP){
                rP--;
            }
            swap(arr, lP, rP);

        }
        swap(arr, lP, highIndex);

        return lP;
    }
    private static void swap(int[] arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;
    }
}
class KunalsSolution {
    public static void main(String[] args) {
        int[] arr = {54,44,33,22,22,2222,11,1} ;
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) /2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s <= e) {
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    private static void swap(int[] arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;
    }
}
class ForPractice {
    public static void main(String[] args) {
        int[] arr = {54,44,33,222,22,2222,11,1} ;
        q(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void q (int[] arr, int low , int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) /2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        q(arr,low,e);
        q(arr,s,high);
    }
    static void swap (int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
