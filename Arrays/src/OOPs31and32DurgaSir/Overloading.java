package OOPs31and32DurgaSir;

class Animal {
    {
        System.out.println("Block");
    }
    static {
        System.out.println("Static Block");
    }

    public void m1(Animal a) {
        System.out.println("Animal version");
    }
    public static void m2 () {
        System.out.println("Parent class Static method");
    }

}
class Monkey extends Animal {

    public void m1(Monkey m) {
        System.out.println("Monkey version");
    }
    public static void m2() {
        System.out.println("Child class Static method");
    }
}
class Test {

    public static void main(String[] args) {

        Test t = new Test();
        Animal a = new Animal();
        a.m1(a);
        Monkey m = new Monkey();
        m.m1(m);
        Animal a1 = new Monkey();
        a1.m1(a1);
    }
}
