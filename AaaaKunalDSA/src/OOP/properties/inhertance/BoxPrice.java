package OOP.properties.inhertance;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        super();
        this.price = -1;
    }

    public BoxPrice(double price) {
        this.price = price;
    }

    public BoxPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }

    public BoxPrice(BoxWeight other, double price) {
        super(other);
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
