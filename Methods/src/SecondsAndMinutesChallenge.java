public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(64,6));
        System.out.println(getDurationString(45565l));

    }
    private static String getDurationString (long minutes, long seconds){
        if ( (minutes < 0 ) || (seconds < 0 ) || (seconds > 59 )){
            return "INVALID VALUE";
        }
        long hours = minutes / 60;
       long remainingMinutes = minutes % 60;
        return hours + "h "+ remainingMinutes  + "m " + seconds + "s ";
    }
    private static String getDurationString ( long seconds){
        if ( seconds < 0 ) {
            return "INVALID VALUE";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }

}
