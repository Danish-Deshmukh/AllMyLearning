public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfTheWeek(42));

    }
    public static String printDayOfTheWeek (int day){
        if (day == 0){
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        }else if (day == 2) {
            return "Tuesday";
        }else if (day == 3) {
            return "Wednesday";
        }else if (day == 4) {
            return "Thursday";
        }else if (day == 5) {
            return "Friday";
        }else if (day == 6) {
            return "Saturday";
        }else return "Invalid Number";

//        int switchDay = day;
//        switch (day){
//            case 0:
//                System.out.println("Monday");
//                break;
//            case 1:
//                System.out.println("Tuesday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
//            case 3:
//                System.out.println("Thursday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("Saturday");
//                break;
//            case 6:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        }

    }
}
