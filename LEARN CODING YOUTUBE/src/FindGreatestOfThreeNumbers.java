import java.util.Scanner;

public class FindGreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if (a>b){
            if (a>c) System.out.println(a);
            else System.out.println(c);
        }else {
            if (b>c) System.out.println(b);
            else System.out.println(c);
        }
    }
}

//Another Logic
//    public static void main(String[] args) {
//        int a ,b ,c ;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("For finding greatest Number ");
//        System.out.println("Enter fist Number");
//        a = scanner.nextInt();
//        System.out.println("Enter second Number");
//        b = scanner.nextInt();
//        System.out.println("Enter third Number");
//        c = scanner.nextInt();
//        if ((a > b) && (a>c)){
//            System.out.println(a+" is grater then "+b+" and "+c);
//        } else if ((b > a) && (b>c)) {
//            System.out.println(b+" is grater then "+a+" and "+c);
//        }else  {
//            System.out.println(c+" is grater then "+a+" and "+b);
//        }
//    }