package TimBachaka.ChallengeEx100SortedArrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 4;
        for (int i=n; i>=1; i--){
            for (int j=0; j<i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
//        int[] myIntegers = getIntegers(5);
//        System.out.println(myIntegers);
    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+capacity+" integer values:\r");
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers (int[]array){
        int[]sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for (int i=0; i<sortedArray.length-1; i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
