import java.util.Scanner;

public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        int n , p , result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number ");
        n = scanner.nextInt();
        System.out.println("Enter Power ");
        p = scanner.nextInt();

        for (int i=1; i<=p; i++){
            result = result * n;
        }
        System.out.println(n+" power " + p+ " is = " + result);
    }
}
