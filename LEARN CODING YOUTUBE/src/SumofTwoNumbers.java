import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        int a,b;
        int sum;
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        sum = a + b ;
        System.out.println("The sum of two numbers = "+ sum);
    }
}
