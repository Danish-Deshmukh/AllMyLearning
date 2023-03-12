package OOP.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b ;

    static {
        System.out.println(" static block ");
        b = a * 2;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b + " " + StaticBlock.a);
    }
}
