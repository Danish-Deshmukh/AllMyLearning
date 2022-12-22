import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter your Age = ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        if (n >=18 && n<=120){
            System.out.println("You'r Eligible for Vote");
        }else System.out.println("You'r not Eligible for vote");
    }
}
