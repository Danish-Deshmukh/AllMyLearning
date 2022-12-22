package TimBachaka.MobilePhone;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(intput.nextInt());
//            }
//        }
//        System.out.println(list);
        int[] arr ={};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        if (arr.length == 0){
            System.out.println("Array length is zero");
            return -1;
        }
        int maxValu = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValu){
                maxValu = arr[i];
            }
        }
        return maxValu;
    }
}
