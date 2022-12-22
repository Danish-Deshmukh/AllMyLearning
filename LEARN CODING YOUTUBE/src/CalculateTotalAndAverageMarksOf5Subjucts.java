import java.util.Scanner;

public class CalculateTotalAndAverageMarksOf5Subjucts {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("Enter Marks of Five Subjects");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 1st number = ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        e=scanner.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Sum of marks is = "+sum);
        double avg = sum/5;
        System.out.println("Average maks = "+avg);

    }

}
