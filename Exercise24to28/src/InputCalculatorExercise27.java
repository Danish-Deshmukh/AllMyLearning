import java.util.Scanner;

public class InputCalculatorExercise27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        int count = 0;

        while (scanner.hasNextInt()){
            sum = sum + scanner.nextInt();
            count = count + 1;
        }
            System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));

        scanner.close();
    }
}
