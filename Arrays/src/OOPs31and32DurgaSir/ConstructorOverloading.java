package OOPs31and32DurgaSir;

public class ConstructorOverloading {
}
class A {

    A (double d){
        this(10);
        System.out.println("double constructor");
    }
    A (int i){
        this();
        System.out.println("int cons");
    }
    A (){
        System.out.println("No arg cons");
    }

    public static void main(String[] args) {
        A a = new A (10.5);
        System.out.println("=================");
        A a1 = new A (10);
        System.out.println("=================");
        A a2 = new A ();
    }
}
