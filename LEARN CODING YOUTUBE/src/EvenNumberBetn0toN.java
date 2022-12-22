import java.util.Scanner;
public class EvenNumberBetn0toN {
    public static void main(String[] args) {
        int n;
        int temp =0;
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            n=scanner.nextInt();
            while (temp<=n){
                System.out.println(temp);
                temp=temp+2;
            }
        }else {
            System.out.println("Invalid Number");
        }
//        input.close();
    }
}
