import java.util.Scanner;

public class TaxCalcuter {
    public static void main(String[] args) {
        int sal; double tax;
        System.out.println("Enter Your Salary ");
        Scanner scanner = new Scanner(System.in);
        sal=scanner.nextInt();
        if (sal <=10000){
            System.out.println(sal +" per no tax"
                    +
                    " (10000 or us se kam salary per)");
        }else if (sal > 10000 && sal <=100000){
            tax = sal * 0.10;
            System.out.println(sal + "Per tax hy "+tax);
        }else {
            tax = sal * 0.20;
            System.out.println(sal+" Per tax hy " + tax);
        }

    }
}
