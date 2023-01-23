package FunctionsOrMethods;
public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        swap(a, b);

        System.out.println(a + " " + b);

        String haha = "Danish Deshmukh";
        changeName(haha);
        System.out.println(haha);
    }

    static void changeName(String name) {

        name = "Muba";
        System.out.println(name);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
