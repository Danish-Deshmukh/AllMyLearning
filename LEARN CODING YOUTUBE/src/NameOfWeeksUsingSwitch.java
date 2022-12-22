import java.util.Scanner;

public class NameOfWeeksUsingSwitch {
    public static void main(String[] args) {
        int a ;
        while (true){
            System.out.println("Enter Number between 1 to 7 ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Number");
            }
        }
    }
}
