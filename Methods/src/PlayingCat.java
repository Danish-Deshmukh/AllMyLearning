public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,5));
    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if (summer==true) {
            if (temperature >= 25 && temperature <=45){
                return true;
            }
            else {
                return false;
            }
        }else if (temperature >= 25 && temperature <= 35){
            return true;
        }else return false;
        }
    } // We have two lives, and the second begins when you realise we only have one .

//
//    public static boolean isCatPlaying(boolean summer,int temperature){
//        if(summer==true) {
//            if(temperature>=25 && temperature<=45) {
//                return true;
//            }
//            else {
//
//                return false;
//            }} else if(temperature>=25 && temperature<=35){
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}
