import java.util.Scanner;

// this keyword in java
public class Test {
    int i;

    void setValues(int i) {
        Scanner scanner = new Scanner(System.in);
        i=scanner.nextInt();
        this.i = i;
    }

    void show() {
        System.out.println(i);
    }
}

class Xyz {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.print("Enter your Number ");
        t.setValues(t.i);
        System.out.print("Your Number is ");
        t.show();
        ThisDemo td = new ThisDemo();
        td.m2();

    }
}

class ThisDemo {
    void m1 (ThisDemo td){
        System.out.println("im in m1 method");
    }
    void m2(){
        m1(this);
    }
}
