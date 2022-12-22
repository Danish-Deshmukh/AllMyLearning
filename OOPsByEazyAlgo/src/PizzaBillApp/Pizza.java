package PizzaBillApp;

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
            System.out.println("You have selected Veg Pizza");
        }
        else {
            this.price = 400;
            System.out.println("You have selected nonVeg Pizza");
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        isExtraCheeseAdded = true;

        this.price += extraCheesePrice;
    }

    public void addextraToppings() {
        isExtraToppingsAdded = true;

        this.price += extraToppingsPrice;
    }
    public void takeAway() {
        isOptedForTakeAway = true;

        this.price += backPack;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Base Pizza Pice is "+"\u20B9"+this.basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra cheese added: "+"\u20B9"+extraCheesePrice+"\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Topping added: " +"\u20B9"+ extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: "+"\u20B9" + backPack + "\n";
        }
        bill += "Bill: "+"\u20B9"+this.price+"\n";
        System.out.println(bill);
    }
}