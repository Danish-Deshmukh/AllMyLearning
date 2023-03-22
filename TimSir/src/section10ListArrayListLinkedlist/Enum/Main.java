package section10ListArrayListLinkedlist.Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.MON;
        System.out.println(DayOfTheWeek.SATUR);
        System.out.println(DayOfTheWeek.SUN);

        for (int i = 0; i < 10; i++) {

            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//            if (weekDay == DayOfTheWeek.FRIDAY) {
//                System.out.println("Found a Friday");
//            }
            switchDayOfWeek(weekDay);
        }
        System.out.println("-".repeat(45));
        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }
    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WEDNES -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SATUR -> System.out.println("Saturday is Day " + weekDayInteger);

            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }
    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
