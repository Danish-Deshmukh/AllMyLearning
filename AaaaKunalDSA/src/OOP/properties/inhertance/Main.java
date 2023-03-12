package OOP.properties.inhertance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight();

        BoxPrice box2 = new BoxPrice(42,34);
        System.out.println(box2.weight);
        System.out.println(box2.price);


        BoxWeight box = new BoxWeight();
        box.greetin();
    }
}
