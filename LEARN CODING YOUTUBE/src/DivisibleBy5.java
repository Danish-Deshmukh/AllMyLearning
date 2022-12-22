import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        while (true){

            int a;
            System.out.println("Enter Number");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a % 5 == 0) System.out.println(a +" is Divisible by 5");
            else System.out.println(a + " is not Divisible by 5");
        }
    }
}
