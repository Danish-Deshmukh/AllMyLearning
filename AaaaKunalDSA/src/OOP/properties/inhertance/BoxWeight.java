package OOP.properties.inhertance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight () {
        this.weight = -1;
    }

//     static void greetin() {
//        System.out.println("In BoxWeight");
//    }
     BoxWeight(double weight) {

        this.weight = weight;
    }
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
