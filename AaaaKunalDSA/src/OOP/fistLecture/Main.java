package OOP.fistLecture;

public class Main  {

    public static void main(String[] args) {
        Student kamil = new Student(20,"Kamil Khan",51.21f);
        Student danish = new Student(16,"Danish Deshmukh",50.21f);

        Main mainObj = new Main();
        mainObj.call(kamil);
        mainObj.call(danish);
    }
  void call(Student student) {

        System.out.println(Student.marks);
        System.out.println(Student.name);
        System.out.println(Student.rno);
    }
}
class Student  {
    static int rno;
    static String name;
    static float marks;

    Student () {
        new Student(rno,name,marks);
    }
   Student(int rno, String name, float marks) {
        Student.rno = rno;
        Student.name = name;
        Student.marks = marks;
    }
}
