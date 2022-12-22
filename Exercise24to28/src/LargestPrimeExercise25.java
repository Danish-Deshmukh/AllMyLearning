public class LargestPrimeExercise25 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime( 28));
    }
    public static int getLargestPrime ( int number){
        if (number <= 1) return -1;
        for(int i = 2 ; i < number; i++) {
            if(number % i == 0) {
                number = number /i  ;
                i--;
            }
        }
        return number;
    }
}
