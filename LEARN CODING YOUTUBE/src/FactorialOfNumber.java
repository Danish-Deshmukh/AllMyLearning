import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n,fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number ");
        n=scanner.nextInt();
        for (int i=n; i>=1; i--){
            fact *=i;
        }
        System.out.println(fact);
    }
}
