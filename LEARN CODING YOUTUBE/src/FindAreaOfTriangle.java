// If three sides are given


import java.util.Scanner;

public class FindAreaOfTriangle {
    public static void main(String[] args) {
        double a,b,c,sum , area;
        System.out.println("Enter sides");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        sum = (a+b+c)/2;
        area = (double) Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
        System.out.println(area);
    }
    }

