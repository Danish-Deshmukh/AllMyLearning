package FunctionsOrMethods;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // you can't declare a in the block (like --> int a = 45 ) but you can use or update the value like in below.
        int b = 20;
        System.out.println(b);
        {
            System.out.println(a);
            a = 45;
            int c = 23;
            System.out.println(c);
        }
        // you can't use or update the value outside the block , but you can declare it .
        System.out.println(a); // a is already declared , it is updating in the block
        int c = 34; // c can be declare outside the block.
        System.out.println(c);

    }
}
