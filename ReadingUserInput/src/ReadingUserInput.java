import java.util.Scanner;
public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Year of Brith : ");

        boolean hasNexInt = scanner.hasNextInt();

        if (hasNexInt){
            int yearOfBirht = scanner.nextInt();
            scanner.nextLine(); // handle next line character ( enter key )

            System.out.println("Enter your Name : ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirht;

            if (age >0 && age <121) {
                System.out.println("Your Name is " + name + " , and you are "+ age +" years old.");
            }else {
                System.out.println(" Invalid Year of Birth ");
            }
        }else {
            System.out.println(" Only Type Numbers Brothers :)");
        }
        scanner.close();
    }
}
