package PizzaBillApp;
public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addextraToppings();
    }
    @Override
    public void addExtraCheese() {    }

    @Override
    public void addextraToppings() {    }
}
