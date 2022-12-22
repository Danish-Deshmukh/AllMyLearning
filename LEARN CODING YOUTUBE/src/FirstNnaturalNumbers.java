import java.util.Scanner;

public class FirstNnaturalNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter NO. of terms");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            n=scanner.nextInt();
            for (int i=1; i<=n; i++){
                System.out.print(" "+i);
            }
        }else {
            System.out.println("Invalid Value");
        }

    }
}
