//Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//        The method should return the greatest common divisor of the two numbers (int).
//        The greatest common divisor is the largest positive integer that can fully divide each of
//        the integers (i.e. without leaving a remainder)
public class GreatestCommonDivisorExersice20 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }
    public static int getGreatestCommonDivisor(int first , int second )
    {
        if (first < 10 || second < 10)
        {
            return -1;
        }

        while (second != 0)
        {
            if (first > second) //--> 25 > 15
            {
                first -= second; //--> 25 - 15 = 10
            }
            else
            {
                second -= first;
            }
        }

        return first;
    }
 }



//    public static int getGreatestCommonDivisor(int first , int second )
//    {
//        if (first < 10 || second < 10)
//        {
//            return -1;
//        }
//
//        while (second != 0)
//        {
//            if (first > second) //--> 25 > 15
//            {
//                first -= second; //--> 25 > 15 = 10
//            }
//            else
//            {
//                second -= first;
//            }
//        }
//
//        return first;
//    }