import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter any Number  ");
        Scanner r = new Scanner(System.in);
        number = r.nextInt();

        if (number % 2 == 0) System.out.println("Number is Even ");
        else System.out.println("Number is Odd");
    }
}









