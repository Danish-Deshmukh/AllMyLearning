import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        int n, a,remaining , armstrong = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number");
            n = scanner . nextInt();
            a = n;
            while (n>0){
                remaining = n%10;
                armstrong = (remaining*remaining*remaining)+armstrong;
                n = n/10;
            }if (a == armstrong) System.out.println(a+" is armstorng");
            else System.out.println(a + " is not ");
    }
}
