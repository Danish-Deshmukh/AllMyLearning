package OOP.interfaces;

public class SportsCar implements Brake,Engine,Media{


    @Override
    public void brake() {
        System.out.println("Sports car brake");
    }

    @Override
    public void start() {
        System.out.println("Sports car start");
    }

    @Override
    public void stop() {
        System.out.println("Sports car stoop");
    }

    @Override
    public void acc() {
        System.out.println("Sports car acc");
    }
}
