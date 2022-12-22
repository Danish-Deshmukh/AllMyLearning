import java.util.Scanner;

public class AnotherInputForUnderstanding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        Integer number = scanner.nextInt();
        while (scanner.hasNextInt()){
            if (number > 0 && number < 100){
                System.out.println(number + " is your number ");
            }
            else {
                System.out.println(number + " is Invalid number");

            }
        }
        scanner.close();

    }
}
