//Write a method called isPalindrome with one int parameter called number.
//
//        The method needs to return a boolean.
//
//        It should return true if the number is a palindrome number otherwise it should return false.
//
//        Check the tips below for more info about palindromes.
//
//        Example Input/Output
//
//        isPalindrome(-1221); → should return true
//
//        isPalindrome(707); → should return true
//
//        isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//
//        Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number.
//        For example: 121, 12321, 1001 etc.
//
//        Tip: Logic to check a palindrome number
//
//        Find  the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//
//        If both are the same then the number is a palindrome otherwise it is not.
//
//        Tip: Logic to reverse a number
//
//        Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//        Extract the last digit of the given number by performing the modulo division (remainder).
//        Store the last digit to some variable say lastDigit = num % 10.
//        Increase the place value of reverse by one.
//        To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//        Add lastDigit to reverse.
//        Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//        Repeat steps until number is not equal to (or greater than) zero.
//
//        A while loop would be good for this coding exercise.
//
//
//
//        Tip: Be careful with negative numbers. They can also be palindrome numbers.
//
//        Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
//
//
//
//        NOTE: The method isPalindrome needs to be defined as public static like we have been doing




public class NumberPalindromeExercise15 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome (int number){
        int num = number;
        int reverse = 0;
        while (num != 0){
            int current = num % 10;
            reverse = current + reverse;
            reverse = reverse * 10;
            num = num / 10;
        }
        reverse = reverse / 10;
        if ( reverse == number){
            return true;
        }else return false;
    }
}
//Logic for the solution :
//    Hi there! Best way to understand any code is to first understand the problem then translate the steps into code.
//        Let says given this input 121. From human perspective we know it is. How do we know? Well because the first and
//        last digits are the same leaving the middle digit which is unique. Now lets try with 1221. Again, we know it is a palindrome
//        because first and last digits are same and next digits are the same too. It seems like we are using a common data structure
//        approach called pointers where we check the start and last then the second and second last etc. We can also look at it like this :
//        If the number reverse is equal to the original number than it is a palindrome.
//
//        To translate this to code using the second approach(text in bold), lets write the steps out first.
//        1) reverse the number
//        2) check if reverse is equal to original.
//
//        To translate this to java we need to know how to reverse a digit. Using what we learned so far in the course,
//        we learned about the % and / operators. We can use this to reverse the number. So lets say we want to reverse 123.
//        We know the reverse needs to look like 321. 321 is also same as 300 + 20 + 1. Do you see the pattern? A multiple of 10 each time. Using this ,
//
//        int temp = number;
//        int reverse = 0;
//        while(temp >0){
//        int current = temp % 10;
//        reverse  = current + reverse; <--- when we get to last digit we have 321 but because we multiply 10 next line
//        reverse = reverse * 10; <--- this results in 3210 instead of 321 at the final step.
//// what reverse will look like each step is this: reverse = (0 + 3 ) * 10,  reverse = (30+ 2) * 10, (320+1).
//        temp = temp/10;
//
//        }
//
//// at this step we get 3210 <--- we need to divide by 10 to get 321
//        reverse = reverse/10;
//
//        Now all we have to do is check this reverse number which is 321 if it equals to 123. In this case its false.
//        To check if same we just use == to compare.
//
//        I encourage you try to implement this code logic or another. Hope this helps!


//example 123
//
//        values for the first loop are:
//
//        int current = temp % 10; --> 123 % 10 = 3
//        reverse = current + reverse; --> 3 + 0 = 3
//        reverse = reverse * 10; --> 3 * 10 = 30
//        temp = temp/10; --> 123 / 10 = 12
//
//        values for the second loop are:
//
//        int current = temp % 10; --> 12 % 10 = 2
//        reverse = current + reverse; --> 2 + 30 = 32
//        reverse = reverse * 10; --> 32 * 10 = 320
//        temp = temp/10; -->  12 / 10 = 1
//
//        values for the third loop are:
//
//        int current = temp % 10; --> 1 % 10 = 1
//        reverse = current + reverse; --> 1 + 320 = 321
//        reverse = reverse * 10; --> 321 * 10 = 3210
//        temp = temp/10; -->  1 / 10 = 0

