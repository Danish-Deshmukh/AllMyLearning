package ConditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int in = input.nextInt();
//        Fibonacci(in);


        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count = count +1;
        }
        System.out.println(b);
    }
    static void Fibonacci(int n){

        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count = count +1;
        }
        System.out.println(b);
    }
}
