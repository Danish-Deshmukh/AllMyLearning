import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n , sum =0, r; //a = 123 =6
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Number");
            n=scanner.nextInt();
            while (n >0){
                r = n %10;
                sum = sum + r;
                n = n/10;
            }
            System.out.println(sum);
        }
    }
}
