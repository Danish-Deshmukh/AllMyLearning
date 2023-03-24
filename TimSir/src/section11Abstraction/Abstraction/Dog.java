package section11Abstraction.Abstraction;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("Slow")) {
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + "Running");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print(" Howling! ");
        } else {
            System.out.print(" Woof! ");
        }
    }
}
