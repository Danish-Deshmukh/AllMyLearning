import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        int n , a,sum=0;
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
//        a = n;
        for (int i=1; i<=n/2; i++){
            if (n%i==0){
                sum+=i;
            }
        }if (sum == n){
            System.out.println("PerfectNumber");
        }else System.out.println("Not PerfectNumber");
    }
}
