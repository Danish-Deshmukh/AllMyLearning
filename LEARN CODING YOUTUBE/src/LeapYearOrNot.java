import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        while (true){

            int y;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter year");
            y = scanner.nextInt();
            if (y%100==0 && y%400==0 || y%100!=0 && y%4==0 ){
                System.out.println("Leap Year");
            }else System.out.println(
                    "Not a leap year"
            );
        }
    }
}
