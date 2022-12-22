package TimBachaka.MobilePhone;

import java.util.Scanner;

public class ForDelete {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");

        for (int i = 0; i < 11; i++) {
            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print(j);
                for (int k = 0; k < j; k++) {
                    System.out.print(k);
                    for (int l = 0; l < k; l++) {
                        System.out.print(l);
                    }
                }
            }
            System.out.println();
        }
        for (int i = 11; i > 0; i--) {
            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print(j);
                for (int k = 0; k < j; k++) {
                    System.out.print(k);
                    for (int l = 0; l < k; l++) {
                        System.out.print(l);
                    }
                }
            }
            System.out.println();
        }
    }
}
