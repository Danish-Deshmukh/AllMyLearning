package KunalKushwaha.LinearSearch;

public class OptimizedEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,533,2,6,7896,12,452,2,3232,
                23,235,54,65,65656,56,56,56,56,577,6,
                6,54345,56,35656,356,546,356,36767,
                56356,23};
        System.out.println(findNumbers(nums));
        System.out.println(digit(0));
    }
    static int findNumbers (int[] nums){

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count ;
    }
    static boolean even (int num){
        int numberDigits = digit(num);
        /*
        if (numberDigits % 2==0){
            return true;
        }
        return false;
         */
        return numberDigits % 2 == 0;
    }
    static int digit(int num){

        if (num <0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) +1;
    }

}
