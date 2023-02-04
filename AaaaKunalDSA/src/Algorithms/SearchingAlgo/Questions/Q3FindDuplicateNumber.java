package Algorithms.SearchingAlgo.Questions;

public class Q3FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicateNumber(arr));

    }
    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
               swap(arr,i,correct);
            } else i++;
        }
        return arr[arr.length-1];
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
