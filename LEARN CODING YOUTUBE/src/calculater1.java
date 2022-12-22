import java.util.Scanner;
public class calculater1 {
    public static void main(String[] args) {
        long num1,numb2 ,chal; char operator;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Fist number = ");
            num1 = scanner.nextLong();

            System.out.println("Chose between '+' '-' '*' '%' '/' ");
            operator=scanner.next().charAt(0);

            System.out.println("Enter Second number");
            numb2= scanner.nextLong();

            if (operator=='+'){
                chal = num1 + numb2;
                System.out.println("SUM = "+chal);
            }else if (operator=='-'){
                chal = num1 - numb2;
                System.out.println("SUM = "+chal);
            }else if (operator=='*') {
                chal = num1 * numb2;
                System.out.println("SUM = " + chal);
            }else if (operator=='%') {
                chal = num1 % numb2;
                System.out.println("SUM = " + chal);
            }else if (operator=='/') {
                chal = num1 / numb2;
                System.out.println("SUM = " + chal);
            }else {
                System.out.println("Invalid Operator");
//                continue;
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
