class Test1 {
//     void show() {
//        System.out.println("1");
//    }
}

//class Xyza extends Test1 {
//    void show(int a){
//        System.out.println("23");
//    }
//
//    void show(){
//        super.show();
//        this.show(2);
//        System.out.println("2");
//    }
//
//    public static void main(String[] args) {
//        Xyza t = new Xyza();
//        t.show();
//    }
//}
interface Drawable {
    void draw();
}
//Implementation: by second user
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

//Using interface: by third user
class TestInterface1 {
    public static void main(String args[]) {
        Drawable d = new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }
}