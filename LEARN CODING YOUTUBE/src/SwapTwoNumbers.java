import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        withoutThirdVariable();
        int a  ,b  ,c  ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        a = scanner.nextInt();
        System.out.println("Enter b ");
        b = scanner.nextInt();
         c = a;   // c = 10
         a = b;  // a =  20
         b = c; // b = 10
        System.out.println("a = "+ a + " b =  " + b);
    }
    public static void withoutThirdVariable(){
        int x , y;
        System.out.println("Enter Two numbers x and y");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print x = ");
        x = scanner.nextInt();
        System.out.println("Print y = ");
        y = scanner.nextInt();
        x = x + y ; // 10 + 20 = 30
        y = x - y; //  30 - 20 = 10
        x = x - y;//   30 - 10 = 20
        System.out.println(" x = "+ x + " y = "+y);
    }
}
