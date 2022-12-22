import java.util.Scanner;

public class SumOfNnaturalNumbers {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Enter NO. of terms");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            n=scanner.nextInt();
            for (int i=1; i<=n; i++){
                sum = sum + i;
            }
            System.out.print("Sum of "+n+" natural Numbers are " + sum);
        }else {
            System.out.println("Invalid Value");
        }

    }

}
