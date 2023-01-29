package ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        reverse(b);
        int a = 123;
        int rev = 0;

        while (a > 0){

           int temp = a % 10 ;
            a = a / 10;
//             rev = (rev+temp)*10;
           rev = (rev * 10) +temp;
        }
//        rev = rev /10;
//        System.out.println(rev);
    }

    // Using method
    static int reverse(int a){
        int rev = 0;

        while (a > 0){

            int temp = a % 10 ;
            a = a / 10;
//             rev = (rev+temp)*10;
            rev = (rev * 10) +temp;
        }
        return rev;
    }
}
