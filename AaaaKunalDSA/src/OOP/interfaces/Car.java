package OOP.interfaces;

public class Car implements Engine,Brake,Media{

    int a = 20;
    @Override
    public void brake() {
        System.out.println("Normal Brake");
    }

    @Override
    public void start() {
        System.out.println("Normal Start");
    }

    @Override
    public void stop() {
        System.out.println("Normal Stop");
    }

    @Override
    public void acc() {
        System.out.println("Normal Accelerate");
    }
}
