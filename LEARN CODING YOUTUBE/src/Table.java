import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter table number");
        num=scanner.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(i+") "+num*i);
        }
    }
}
