import java.util.Scanner;

public class FindSquareRootOfaNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double m = Math.sqrt(n);
        System.out.println("Square root of "+n+" is "+m);

    }
}
