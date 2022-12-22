package OOPs31and32DurgaSir;

class P {
    public void property(){
        System.out.println("Gold , Land , Cash");
    }
    public void marry () {
        System.out.println("Parent Method : Appalamma , Subba");
    }
    private void m1 () {
        System.out.println(" In P");
    }
    public void getm1 () {
        this.m1();
    }
    public void m2(int...i){
        System.out.println("P");
    }
}
class C extends P {

    public void marry(){
        System.out.println("Child Method : Katrina");
    }
    private void m1 (){
        System.out.println("In C");
    }
    public void m2(int... i){
        System.out.println("C");
    }
}
class Test1 {
    public static void main(String[] args) {
        P p = new P();
        p.marry();
        p.getm1();
        p.m2(10);

        C c = new C ();
        c.marry();
        c.m2(10);

        P p1 = new C ();
        p1.marry();
        p1.m2(10);

        Object o = new StringBuffer("Danish");
        StringBuffer sb = (StringBuffer) o;
        System.out.println(sb);
    }
}
