public class SpeedConverter {
    public static long toMilesPerHour (double KilometerPerHour) {
        if (KilometerPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = KilometerPerHour / 1.609;
            return Math.round(milesPerHour);
        }
    }
}
