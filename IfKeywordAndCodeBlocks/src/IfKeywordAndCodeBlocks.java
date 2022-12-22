public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 400;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score >1000){
//            System.out.println("Your score was less than 5000 but Greater than 1000");
//        }
//        else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

//        boolean secondSore = true;
//        int score2 = 10000;
//        int levelCompletes2 = 8;
//        int bonus2= 200;
//        if (secondSore) {
//            int sencondScore = score2 + (levelCompletes2 * bonus2);
//            System.out.println("Your send final Score" + sencondScore);
//        }

        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }



    }
}
