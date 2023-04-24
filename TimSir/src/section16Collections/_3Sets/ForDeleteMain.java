package section16Collections._3Sets;

import java.util.*;


class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name " + name + " Age " + age + "\n";
    }

    @Override
    public int compareTo(Student that) {
        if (this.name.equals(that.name)) {
            return 1;
        }
        else {
            return -1;
        }
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
public class ForDeleteMain {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.name.equals(j.name)) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        List<Student> list = new ArrayList<>();
        list.add(new Student(15, "Zaid"));
        list.add(new Student(20, "Sanu"));
        list.add(new Student(18, "Muba"));
        list.add(new Student(21, "Danish"));



//        for (Student s : list) {
//            System.out.println(s);
//        }
//        System.out.println("-".repeat(21));
//
//                Collections.sort(list);
//        for (Student s : list) {
//            System.out.println(s);
//        }


        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        int result = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(sum, n) -> sum + n);

        System.out.println(result);

        Set<String> one = new HashSet<>();
        one.add("Danish");
        one.add("zaid");
        one.add("Muba");

        Set<String> two = new HashSet<>();
        two.add("Danish");
        two.add("Sanu");
        two.add("Muba");

        Set<String> merge = new HashSet<>(one);
        merge.retainAll(two);
        System.out.println(" for same elements " +merge);

        Set<String> diffOne = new HashSet<>(one);
        diffOne.removeAll(two);
        System.out.println("diff " + diffOne);

        Set<String> diffTow = new HashSet<>(two);
        diffTow.removeAll(one);
        System.out.println("diffTow " + diffTow);
    }
}
