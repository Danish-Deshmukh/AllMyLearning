public class Main {
    public static void main(String[] args){

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int prviousResult = result;
        System.out.println("prviousResult = " + prviousResult);
        result = result - 1; // 3 - 1 = 1
        System.out.println("3 - 1 = " + result);
        System.out.println("prviousResult = " + prviousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        System.out.println("prviousResult = " + prviousResult);

        result = result / 5; // 20 / 5 = 4
        System.out.println("5 / 20 = "+ result);

        result = result % 3;// 4 % 3 = 1
        System.out.println("4 % 3 = "+ result);

        result = result + 2 ;

        // result = result + 2;
        result++; // 2 + 2 = 4
        System.out.println("2 + 2 = " + result);

        result--; // 4 - 1 = 3
        System.out.println("4 - 1 = "  + result);

        // result = result + 2;
        result +=2; // 3 + 2 = 5
        System.out.println("3 + 2 = " + result);

        result *= 10;
        System.out.println(result);// and = 50

        result /= 5;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        boolean isDanny = true;
        if (isDanny == false) {
            System.out.println("He is Human!");
            System.out.println("And HE is a Good one");
        }

        int imDanny = 10;
        if (imDanny ==1)
            System.out.println("good");
        else System.out.println("bad");

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("hii");
        }
        boolean isCar = false;
        if (isCar){
            System.out.println("iscar");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false ;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        int agaOfCliet = 15;
        boolean isEighteenOrOver = (agaOfCliet == 20)? true : false;
        System.out.println(isEighteenOrOver);

    }
}
