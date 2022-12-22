package ForDelete;

public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car(6, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.Break());

        WegonR wegonR = new WegonR(6, "VXI");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.Break());
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }
    public String startEngine() {
        return getClass().getSimpleName() + " -- startEngine";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -- Accelerate";
    }
    public String Break() {
        return getClass().getSimpleName() + " -- Braking";
    }
}
class WegonR extends Car {
    public WegonR(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -- startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -- Accelerate";
    }

    @Override
    public String Break() {
        return getClass().getSimpleName() + " -- Braking";
    }
}

class Swift extends Car {
    public Swift(int cylinders, String name) {
        super(cylinders, name);
    }

}

class M800 extends Car {
    public M800(int cylinders, String name) {
        super(cylinders, name);
    }
}
