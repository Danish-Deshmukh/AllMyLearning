import java.util.Scanner;

public class PrintAllPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int a ,b ,i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Number");
        a = scanner.nextInt();
        System.out.println("Input Second Number");
        b = scanner.nextInt();

        for ( i=a; i<=b; i++){

            for (j=2; j<=i; j++){
                if (i%j==0)
                    break;
            }
            if (i == j)
                System.out.print(j+" ");
        }
    }
}
