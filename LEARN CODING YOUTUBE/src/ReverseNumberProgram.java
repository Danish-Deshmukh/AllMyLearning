import java.util.Scanner;

public class ReverseNumberProgram {
    public static void main(String[] args) {
        while (true) {

            long a, rev =0 ,c;
            System.out.println("Enter Numbers");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextLong();
            while (a > 0) {
                rev = a % 10;
                System.out.print(rev);
                a = a / 10;
            }
            System.out.println("");
        }
    }
}



//    int sum=0;
//        for (int i=0,j=0; i<5&& j<5; ++i,j=i+1){
//        sum +=i;
//        System.out.println(sum);
//    }
//}