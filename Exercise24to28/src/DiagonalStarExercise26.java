public class DiagonalStarExercise26 {
    public static void main(String args[]) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if(number < 1) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if (row == 0 || row ==number -1)
                        System.out.print("O");// for fist and last row
                    else if (column == 0)
                        System.out.print("O"); // left column
                    else if (column == number-1)
                        System.out.print("O"); // right column
//                    else if (row==column) System.out.print("*"); // for diagonal down right
//                    else if (column==number-1-row) System.out.print("*"); // for diagonal left

                    else System.out.print("-");
                }
                System.out.println("");
            }
        }
    }
} //
//public class DiagonalStar{
//    public static void printSquareStar(int number){  //--> number = 5
//        if(number < 5) System.out.println("Invalid Value"); // condition false
//        else{
//            for (int row = 0; row <number; row++){ // row = 0,1,2,3,4

//                for (int column=0; column<number; column++){ // C=0,1,2,3,4

//                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
// L1 0=0 or 0=4 or 0=0 or 0=4 or 0=0 or 0=4 T
// L2 0=0 or 0=4 or 1=0 or 1=4 or 1=0 or 1=4 T
// L3 0=0 or 0=4 or 2=0 or 2=4 or 2=0 or 2=4 T
// L4 0=0 or 0=4 or 3=0 or 3=4 or 3=0 or 3=4 T
// L5 0=0 or 0=4 or 4=0 or 4=4 or 4=0 or 4=4 T

// L1 1=0 or 1=4 or 0=0 or 0=4 or 0=1 or 0=3 T
// L2 1=0 or 1=4 or 100 or 1=4 or 1=1 or 1=3 T  Diagonal Down to Right
// L3 1=0 or 1=4 or 2=0 or 2=4 or 2=1 or 2=3 F
// L4 1=0 or 1=4 or 3=0 or 3=4 or 3=1 or 3=3 T  Diagonal Down to Left
// L4 1=0 or 1=4 or 4=0 or 4=4 or 4=1 or 4=3 T

// L1 2=0 or 2=4 or 0=0 or 0=4 or 0=2 or 0=2 T
// L2 2=0 or 2=4 or 1=0 or 1=4 or 1=2 or 1=2 F
// L3 2=0 or 2=4 or 2=0 or 2=4 or 2=2 or 2=2 T  Diagonal Down to Right
// L4 2=0 or 2=4 or 3=0 or 3=4 or 3=2 or 3=2 F
// L5 2=0 or 2=4 or 4=0 or 4=4 or 4=2 or 4=2 T

// L1 3=0 or 3=4 or 0=0 or 0=4 or 0=3 or 0=1 T
// L2 3=0 or 3=4 or 1=0 or 1=4 or 1=3 or 1=1 T  Diagonal Down to Left
// L3 3=0 or 3=4 or 2=0 or 2=4 or 2=3 or 2=1 F
// L4 3=0 or 3=4 or 3=0 or 3=4 or 3=3 or 3=1 T  Diagonal Down to Right
// L4 3=0 or 3=4 or 4=0 or 4=4 or 4=3 or 4=1 T

// L1 4=0 or 4=4 or 0=0 or 0=4 or 0=4 or 0=0 T
// L2 4=0 or 4=4 or 1=0 or 1=4 or 1=4 or 1=0 T
// L3 4=0 or 4=4 or 2=0 or 2=4 or 2=4 or 2=0 T
// L4 4=0 or 4=4 or 3=0 or 3=4 or 3=4 or 3=0 T
// L5 4=0 or 4=4 or 4=0 or 4=4 or 4=4 or 4=0 T

//                    else System.out.print(" ");
//                }

//                System.out.println("");

//            }
//        }
//    }
//}

// out put
// *****
// ** **
// * * *
// ** **
// *****