public class ForLoopStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = "+ calculateInterest(10000,2.0));

        System.out.println("**********************");

        for (double i = 2; i<9; i++ ){

            System.out.println("10,000 at "+ String.format("%.0f", i) +"% interest = "+ String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("............................");
        for (int i = 8; i>=2; i-- ){
            System.out.println("10,000 at "+ i +"% interest = "+ String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("|||||||||||||||||||||||||||||||||");
        int count = 0;
        for (int i = 0; i<50; i++){

            if (isPrime(i)){
                count++;
//                for (int danny = 0; danny <10; danny +=1)
                System.out.println(   " ) Number " + i + " is a prime number");
                if (count==50){
                    System.out.println("Exit the loop");
                    break;
                }
            }
            for (int danny = 0; danny <100; danny +=1);
        }
    }
//    public static void conting(int num){
//        for
//    }
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if ( n % i == 0) {
                return false;
            }
        }return true;
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

}