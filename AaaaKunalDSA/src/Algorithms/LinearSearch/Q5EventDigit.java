package Algorithms.LinearSearch;

public class Q5EventDigit {
    public static void main(String[] args) {

        int[] arr = {12, 345, 2, 6, 7896, 21, 12, 12, 4322, 123};
//        System.out.println(findNumbers(arr));
        System.out.println("-----");
        System.out.println(even(arr));
        int n = (int)(Math.log10(112))+1;
        System.out.println(n);
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int even(int[] arr) {

        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.log10(arr[i])) + 1;
            if (num % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}
