package ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;

        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int ans = 0 ;
//
//        while (true){
//            System.out.println();
//            System.out.println("Add Operator in below");
//            System.out.println("+ , - , / ,% ");
//            char in = scanner.next().trim().charAt(0);
//
//
//            if (in == '+' || in == '-' || in == '/' || in == '%'){
//
//                System.out.println("Enter Fist Number ");
//                int num1 = scanner.nextInt();
//
//                System.out.println("Enter Second Number");
//                int num2 = scanner.nextInt();
//
//                if (in == '+'){
//                    ans = num1 +num2;
//                }
//                if (in == '-'){
//                    ans = num1 -num2;
//                }
//                if (in == '/'){
//                    if (num1 != 0){
//                        ans = num1 +num2;
//                    }
//
//                }
//                if (in == '%'){
//                    ans = num1 %num2;
//                }
//            }
//            if (in == 'X' || in == 'x' ){
//                break;
//            }
//            System.out.print("your answer is --> ");
//            System.out.println(ans);
//            System.out.println("If you want to exit enter 'x'");
//        }
//    }
}
