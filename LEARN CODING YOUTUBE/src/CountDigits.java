import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int n,count = 0;
        System.out.println("Enter any number ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
