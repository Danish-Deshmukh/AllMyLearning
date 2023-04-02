package section12Generics.G4GenericsExtra;

import section12Generics.G4GenericsExtra.util.QueryItem;
import section12Generics.G4GenericsExtra.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);
        testList(new ArrayList<>(List.of("Able", "Barry", "Danish")));
        testList(new ArrayList<>(List.of(1, 2, 3, 4, 5)));

        var quaryList = new QueryList<>(lpaStudents);
        var matches = quaryList.getMatches(
                "Course","Python");
        printList(matches);

        var matches1 = quaryList.getMatches(
                "Course","Java"
        );
        printList(matches1);

        var student2021 = QueryList.getMatches(students,"YearStarted",
                "2021");
        printList(student2021);

//        QueryList<Employee> employeeList = new QueryList<>();
    }

    public static void printList(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            }
            else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }
//    public static <T extends Student> void printList(List<T> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + " " + student);
//        }
//        System.out.println();
//    }
}
