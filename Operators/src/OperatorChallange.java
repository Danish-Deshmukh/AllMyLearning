public class OperatorChallange {
    public static void main(String[] args) {


           double myFirstValue = 80.00d;
           double mySecondValue = 45.00d;
           double addAndMulit = (myFirstValue + mySecondValue) * 70.00d;
        System.out.println("Total Value = "+ addAndMulit);
        double remainder = addAndMulit % 40.00d;
        System.out.println("The Remainder = "+ remainder);
        boolean zeroOrNot = (remainder == 0) ? true : false ;
        System.out.println("Is No Remainder = "+ zeroOrNot);
        if (!zeroOrNot)
            System.out.println("Got Some Remainder");

        }


    }

