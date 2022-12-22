package TimBachaka;

import java.util.Scanner;

 class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
//        scanner.nextInt();

        int[] returnedArray = redIntegers(count);
        int returnMin = findMin(returnedArray);

        System.out.println("min = "+returnMin);
    }

    private static int[] redIntegers(int count) {

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a Number");
            int number = scanner.nextInt();
//            scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){

        int  min = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++){
            int value = array[i];

            if (value < min){
                min = value;
            }
        }
        return min;
    }
}
