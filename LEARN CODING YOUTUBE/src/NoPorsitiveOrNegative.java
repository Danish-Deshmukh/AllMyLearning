import java.util.Scanner;

public class NoPorsitiveOrNegative {
    public static void main(String[] args) {
        int a ;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number ");
            a = scanner.nextInt();
            if (a > 0 ) System.out.println( a +" is Positive Number");
            else if (a < 0)System.out.println(a + " is Negative Number");
            else if (a ==0) {
                System.out.println( a +" is Neither +ve or -ve number");

            } else System.out.println("Invalid Number");
        }
    }
}
