//Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//        EXAMPLE INPUT/OUTPUT:
//        hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//        hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//        hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//        NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a main method to the solution code
public class SharedDigitExercise18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55, 54));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        int originalNum2 = num2;
        while (num1 > 0) {
            while (num2 > 0) {
                if (num1 % 10 == num2 % 10) {
                    return true;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
            num2 = originalNum2;
        }
        return false;
    }
}


//   public static boolean hasSharedDigit(int num1 ,int num2) {
//       if(((num1<10)||(num1>99))||((num2<10)||(num2>99))) {
//            return false;
//       }
//       while(num1!=0) {
//            int last1=num1%10;
//            num1=num1/10;
//            int last2=num2%10;
//            num2=num2/10;
//            int last3=num1%10;
//            num1=num1/10;
//            int last4=num2%10;
//            num2=num2/10;
//            if((last1==last3||last1==last4)||(last2==last3||last2==last4)||(last3==last4)||(last1==last2)) {
//                return true;
//           }
//        }
//        return false;
//   }
//}



































































































































































































































































