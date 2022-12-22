import java.util.Scanner;

public class FindFactorOfaNumber {
    public static void main(String[] args) {
        int a;
        while (true){
            System.out.println("Enter number ");
            Scanner scanner  = new Scanner(System.in);
            a  = scanner.nextInt();
            for (int i=1; i<=a; i++){
                if (a%i==0) System.out.print(i+" ");

            }System.out.println("");
        }
    }
}
