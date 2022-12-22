import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        int n,count = 0 ;
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            if (n% i ==0){
                count++;
            }
        }if (count == 2){
            System.out.println("Number is Prime");
        }else System.out.println("Number is not Prime");
    }
}
