import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {

//        int a = 5, b= 7;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);



        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true){
            System.out.println("Enter Number : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max){
                    max = number;

                }
                if (number < min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }

}
