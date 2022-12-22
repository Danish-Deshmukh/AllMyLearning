package ForDelete;

public class Fun {
}

class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }
    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType
                + " with " + addition1Name + " " + addition2Name + " " + addition3Name
                + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price
                + addition4Price);
    }
}
class DeluxeBurger extends Hamburger {
    //    final String s = "No additional items can be added to a deluxe burger";
    public DeluxeBurger() {
        super("Deluxe", "Bacon & Cheese", 14.54, "Sesame Bun");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);
    }
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
    //    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
//        super(name, meat, price, breadRollType);
//    }
}

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Beyond Burger", meat, price, "Honey Bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public double itemizeHamburger() {
        System.out.println("One order Beyond Burger on Honey Bread "
                + this.healthyExtra1Name + " " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
/**
 * class Hamburger {
 * public static void main(String[] args) {
 * Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
 * hamburger.addHamburgerAddition1("Tomato", 0.27);
 * hamburger.addHamburgerAddition2("Lettuce", 0.75);
 * hamburger.addHamburgerAddition3("Cheese", 1.13);
 * System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
 * <p>
 * HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
 * healthyBurger.addHamburgerAddition1("Egg", 5.43);
 * healthyBurger.addHealthyAddition1("Lentils", 3.41);
 * System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
 * <p>
 * DeluxeBurger db = new DeluxeBurger();
 * db.addHamburgerAddition3("Should not do this", 50.53);
 * System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
 * }
 * private String name;
 * private String meat;
 * private double price;
 * private String breadRollType;
 * <p>
 * private String addition1Name;
 * private String addition2Name;
 * private String addition3Name;
 * private String addition4Name;
 * <p>
 * private double addition1Price;
 * private double addition2Price;
 * private double addition3Price;
 * private double addition4Price;
 * <p>
 * public Hamburger(String name, String meat, double price, String breadRollType) {
 * this.name = name;
 * this.meat = meat;
 * this.price = price;
 * this.breadRollType = breadRollType;
 * }
 * <p>
 * public void addHamburgerAddition1(String name, double price) {
 * this.addition1Price = price;
 * this.addition1Name = name;
 * <p>
 * }
 * <p>
 * public void addHamburgerAddition2(String name, double price) {
 * this.addition2Price = price;
 * this.addition2Name = name;
 * }
 * <p>
 * public void addHamburgerAddition3(String name, double price) {
 * this.addition3Price = price;
 * this.addition3Name = name;
 * }
 * <p>
 * public void addHamburgerAddition4(String name, double price) {
 * this.addition4Price = price;
 * this.addition4Name = name;
 * }
 * <p>
 * public double itemizeHamburger() {
 * System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
 * return (price + addition1Price + addition2Price + addition3Price + addition4Price);
 * }
 * }
 * <p>
 * <p>
 * //DeluxeBurger.java
 * <p>
 * class DeluxeBurger extends Hamburger {
 * <p>
 * public DeluxeBurger() {
 * super("Deluxe", "Bacon & Cheese", 19.10, "Sesame Bun"); // all the fixings and chips and a drink for base price of $19.10
 * super.addHamburgerAddition1("Chips", 0);
 * super.addHamburgerAddition2("Drink", 0);
 * }
 *
 * @Override public void addHamburgerAddition1(String name, double price) {
 * System.out.println("No additional items can be added to a deluxe burger."); // best practice is to use final String variable to print the same message instead of repeating it 4 times...but online checker won't allow for extra variables.
 * }
 * @Override public void addHamburgerAddition2(String name, double price) {
 * System.out.println("No additional items can be added to a deluxe burger.");
 * }
 * @Override public void addHamburgerAddition3(String name, double price) {
 * System.out.println("No additional items can be added to a deluxe burger.");
 * }
 * @Override public void addHamburgerAddition4(String name, double price) {
 * System.out.println("No additional items can be added to a deluxe burger.");
 * }
 * }
 * <p>
 * <p>
 * //HealthyBurger.java
 * class HealthyBurger extends Hamburger {
 * <p>
 * private String healthyExtra1Name;
 * private String healthyExtra2Name;
 * <p>
 * private double healthyExtra1Price;
 * private double healthyExtra2Price;
 * <p>
 * public HealthyBurger(String meat, double price) {
 * super("Beyond Burger", meat, price, "Honeywheat Bread");
 * }
 * <p>
 * public void addHealthyAddition1(String name, double price) {
 * healthyExtra1Name = name;
 * healthyExtra1Price = price;
 * }
 * <p>
 * public void addHealthyAddition2(String name, double price) {
 * healthyExtra2Name = name;
 * healthyExtra2Price = price;
 * }
 * @Override public double itemizeHamburger() {
 * System.out.println("One order of Beyond Burger on Honeywheat Bread with " + healthyExtra1Name + " " + healthyExtra2Name);
 * return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
 * }
 * }
 */