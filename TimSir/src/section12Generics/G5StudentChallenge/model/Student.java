package section12Generics.G5StudentChallenge.model;

import section12Generics.G5StudentChallenge.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID = 10_000;
    private int studentId;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    protected static String[] fistNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    protected static String[] courses = {"c++", "Java", "Python"};
//    protected static String[] fistNames = {"56645656", "454564566456", "5656464656", "4464656464", "456456"};
//    protected static String[] courses = {"64566+", "J456a456v4545646a", "45456456466"};

    public Student() {

        studentId = LAST_ID++;
        int lastNameIndex = random.nextInt(65, 91);
        name = fistNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentId).compareTo(o.studentId);
    }
}
