public class WhileLoopStatement {
    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value " + count);
            count++;
        }

//        for (int i=1; i<7; i++){
//            System.out.println("Count value is " + count);
//        }
//        for (count = 1; count !=6; count++){
//            System.out.println("Count value izz "+ count);
//        }
        count = 0;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;

        }
        count = 1;
        do {
            System.out.println("count value was " + count);
            count++;
        }while (count !=6);

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooo");

        int num = 0;
        int number = 2;
        int finshNumber = 454545454;
        int recordingEven = 0;

            while (number <= finshNumber) {
                number++;

                if (!isEvenNumber(number)) {
                    continue;
                }
                System.out.println( num + ") Even number " + number);
                recordingEven++;
                    if (recordingEven >=10){
                        break;
                }
            }
        System.out.println("even num recorded "+ recordingEven);
        }
    public static boolean isEvenNumber (int number){
        if ( (number % 17) ==0){
            return true;
        }else {
            return false;
        }
    }
}
