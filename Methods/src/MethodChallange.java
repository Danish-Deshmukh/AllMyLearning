public class MethodChallange {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

        isLeapYear(1);
        System.out.println("Let's See is it's LeapYear = "+ isLeapYear(4));

        areEqualByThreeDecimalPlaces(45,34);
        System.out.println(areEqualByThreeDecimalPlaces(3.422,3.422));


        areEqualByThreeDecimalPlaces1(2,4);
        System.out.println("theejjdfjakd  "+ areEqualByThreeDecimalPlaces1(2.000,1.000));


        System.out.println("sum is "+ hasEqualsum1(1,-1,0));
        System.out.println("summmmm"+ hasEqualSum(1,2,3));

    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
    //    This is LeapYear question
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
//   This is Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
    int myFirstCheck = (int)(myFirstDouble * 1000);
    int mySecondCheck = (int)(mySecondDouble * 1000);
    if(myFirstCheck - mySecondCheck == 0){

        return true;
    } else

        return false;

    }
//    Another one  Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces1(double num1,double num2){
        int p1=(int) (num1*1000);
        int p2=(int) (num2*1000);
        if(p1==p2) {
            return true;
        }
        else {
            return false;
        }
    }
//     Equal Sum Cheaker (Ashraf Solution)
    public static boolean hasEqualSum(int num1,int num2 , int sum){
        int add = num1 + num2;
        if(add==sum) {
            return true;
        } else {
            return false;
        }
    }
//    Equal Sum Cheaker ( Danish's Solution)
    public static boolean hasEqualsum1 (int num1,int num2,int num3){
        if ((num1 + num2) == num3){
            return true;
        }
        return false;
    }
//    Teen Number Checker (Ashraf Solution)

    public static boolean hasTeen(int num1,int num2,int num3){
        if((num1>=13)&&(num1<=19)||((num2>=13)&&(num2<=19))||(num3>=13)&&(num3<=19)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int num1){
        if((num1>=13)&&(num1<=19)) {
            return true;
        } else {
            return false;
        }
    }
//        Teen Number Checker   ( Danish's Solution)
    public static boolean hasTeeen (int num1, int num2, int num3){
        if ((num1>=13) && (num1<=19) || (num2>=13) && (num2<=19) || (num3>=13) && (num3<=19) ){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isTeeen (int num4) {
        if (num4 >= 13 && num4 <= 19){
            return true;
        }else return false;
    }






}


// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an in
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50
//

