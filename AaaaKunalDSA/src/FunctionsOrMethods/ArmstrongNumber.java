package FunctionsOrMethods;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(ArmNo(407));

        for (int i = 100; i <10000 ; i++) {
            if (ArmNo(i)){
                System.out.println(i);
            }
        }
    }
    static boolean ArmNo (int n){

        int temp = n;
        int sum = 0;
        while (n > 0) {

            int rem = n % 10;
            if (temp> 1000){
                sum = sum + rem*rem*rem*rem;
            }
            else sum = sum + rem*rem*rem;
            n = n /10;
        }
        return sum == temp;
    }
}
