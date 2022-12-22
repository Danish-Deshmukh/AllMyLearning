import java.util.Scanner;

public class GreatestNumberBetweenTwoNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number ");

        a = scanner.nextInt();
        System.out.println("Enter Second Number ");
        b = scanner.nextInt();
        if (a>b){
            System.out.println("");
            System.out.println(a + " is greater then " + b);
        }else System.out.println(b + " is greater then "+ a);
    }
}
