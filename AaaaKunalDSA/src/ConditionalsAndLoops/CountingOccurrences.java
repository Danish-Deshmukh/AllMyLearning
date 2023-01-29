package ConditionalsAndLoops;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("-->");
        int a = input.nextInt();
        System.out.print("-->");
        int b = input.nextInt();
        int count = 0;

        while (a > 0){

            int temp = a%10;
            if (temp==b){
                count++;
            }

            a = a/10;
        }
        System.out.println(count);
    }
}
