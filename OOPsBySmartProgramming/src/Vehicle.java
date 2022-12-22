abstract class Vehicle{

     abstract void start();

}
class Car extends Vehicle {

    void start(){
        System.out.println("Car starts With key");
    }
}
class Scooter extends Vehicle{
    void start (){
        System.out.println("Scooter starts with kick");
    }
}
class Main {
    Main () {
        int a = 10;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
        Vehicle v = new Car();
        v.start();
        Vehicle V = new Scooter();
        V.start();
        System.out.println("jjjjjj");
        new Main();
        System.exit(0);
    }
}