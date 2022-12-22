public class challange {
    public static void main(String[] args){


        byte myByteNumber = 10;

        short myShortNumber = 20;

        int myIntNumber = 50;

        long myLongNumber = 50000L + 10L * (myIntNumber + myByteNumber+ myShortNumber);
       // System.out.println(myLongNumber + 10 (myByteNumber ));
        System.out.println(myLongNumber);

        short shrtTotal = (short) (1000 + 10 * (myIntNumber + myByteNumber + myShortNumber));
        System.out.println(shrtTotal);



    }
}
