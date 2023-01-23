package FunctionsOrMethods;

public class Shadowing {
    static int a = 34;

    public static void main(String[] args) {
        System.out.println(a);

        int a ;
        a = 21;
        System.out.println(a);
        fun();

    }
    int b;
    static void fun(){
        System.out.println(a);
    }
    void Ind (){

        b = 3;
        System.out.println(b);
    }
}
