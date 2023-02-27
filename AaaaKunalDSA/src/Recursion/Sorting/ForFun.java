package Recursion.Sorting;

import java.util.Random;

public class ForFun {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 100000;
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i <n ; i++) {
//            list.add(random.nextInt(n));
//        }
//        System.out.println("Before");
//        System.out.print(list);
//        System.out.println("After");
//        System.out.println(bubbleSort(list));

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(n);
        }
        System.out.println("Before");
//        System.out.println(Arrays.toString(num));
        bubbleSort(num);
        System.out.println("After");
//        System.out.println(Arrays.toString(num));
    }
   private static void bubbleSort(int[] arr) {
       boolean swap;
       for (int i = 0; i < arr.length; i++) {
           swap = false;
           for (int j = 1; j < arr.length - i; j++) {


               if (arr[j] < arr[j - 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j - 1];
                   arr[j - 1] = temp;
               }
               swap = true;
           }
           if (!swap){
               break;
           }
       }
   }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
