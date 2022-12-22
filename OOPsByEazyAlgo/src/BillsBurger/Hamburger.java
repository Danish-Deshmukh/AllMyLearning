package BillsBurger;

public class Hamburger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizehamburger());
    }
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger (String name,String meat,double price,String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
     public void addHamburgerAddition1 (String name, double price){
        addition1Name = name;
        addition1Price = price;
    }
    public void addHamburgerAddition2 (String name, double price){
        addition2Name = name;
        addition2Price = price;
    }
    public void addHamburgerAddition3 (String name, double price){
        addition3Name = name;
        addition3Price = price;
    }public void addHamburgerAddition4 (String name, double price){
        addition4Name = name;
        addition4Price = price;
    }
    public double itemizehamburger (){
        System.out.println(name+" Hamburger "+" on a "+breadRollType+" roll with "+meat+", Price is "+price);
        System.out.println("You Orderd "+name+" Burger " +
                " with "+breadRollType+" BreadRoll with "+addition1Name+" "+addition2Name+
                " "+addition3Name+" "+addition4Name);
        return (price+addition1Price+addition2Price+addition3Price+addition4Price);
    }
}
