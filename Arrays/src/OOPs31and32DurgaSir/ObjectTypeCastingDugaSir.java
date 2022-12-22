package OOPs31and32DurgaSir;
class ObjectTypeCastingDugaSir {
}
 class Ocp {
    int a = 10;
    Ocp () {
        this.a = a;
        System.out.println("constructor");
    }
 }
 class Oca extends Ocp  {
    public static void main(String[] args) {
        Oca oa = new Oca();
        Ocp op = (Ocp)oa; // DOES NOT COMPILE
        Test2 g = new Test2();
        g.m1();
        G g1 = new Test2();
        g1.m1();
    }
}
class G {
    protected String s = "Danish";
    void m1 () {
        System.out.println("G class method");
    }
}
class Test2 extends G{
    private int a = 10;
    public void m1(){
        System.out.println(this.a);
        System.out.println(super.s);
    }
}

