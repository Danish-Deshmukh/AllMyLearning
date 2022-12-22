import java.util.Scanner;

public class PalindromNumberOrNot {
    public static void main(String[] args) {
        long a, rev =0 ,c ,store = 0;
        System.out.println("Enter Numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        c = a;
        while (a > 0) {
            rev = a % 10;
            store = (store*10)+rev;
            System.out.print(rev);
            a = a / 10;
        }if (c == store) System.out.println(" palindrom");
        else System.out.println(" not palindrom");
    }
}
