import java.util.Scanner;

public class OddNumberBetn1toN {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number ");
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        System.out.print("Between "+ n+" is :");
        for (int i=1; i<=n; i=i+2){
//            if (i % 2 !=0){
                System.out.print(" "+i);
//            }
        }
    }
}
