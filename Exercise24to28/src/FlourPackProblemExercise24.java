public class FlourPackProblemExercise24 {
    public static void main(String[] args) {
        System.out.println(canPack(1,25,5));
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;
        if (((bigCount*5)+ smallCount >= goal) && (goal % 5 <= smallCount)) return true;
        else return false;
    }
}
//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if(bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        if(((bigCount * 5) + smallCount >= goal) && (goal % 5 <= smallCount)) {
//            return true;
//        } else {
//            return false;
//        }
//    }