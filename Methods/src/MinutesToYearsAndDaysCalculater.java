public class MinutesToYearsAndDaysCalculater {
    public static class main {
        public static void main(String[] args) {
            printYersAndDays(454544454545455l);

        }
        public static void printYersAndDays (long minutes) {
            if (minutes < 0 ){
                System.out.println("Invalid Value");
            }
            else {
                long hour = minutes / 60;
                long days = hour / 24;
                long year = days / 365;
                long remainingYear = days % 365;
                System.out.println(minutes+"min "+ year+"y and "+remainingYear+"d ");
            }
        }
    }

}
