import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        System.out.println(" sum program ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your first number = ");
        int a = sc.nextInt();
        System.out.print("Your second number = ");
        int b = sc.nextInt();
        System.out.print("Your sum number = ");

        int sum = a + b;

        System.out.println(sum);
    }
}
