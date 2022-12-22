package BillsBurger;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

   public HealthyBurger (String meat, double price){
       super("Haha Burger",meat,price,"Honey Bread");
   }
   public void addHealthyAddition1 (String name, double price){
       healthyExtra1Name = name ;
       healthyExtra1Price = price;
   }
    public void addHealthyAddition2 (String name, double price){
        healthyExtra2Name = name ;
        healthyExtra2Price = price;
    }
    @Override
    public double itemizehamburger() {
        System.out.println("One order of Haha Burger on Honey Bread with "+
                healthyExtra1Name+healthyExtra2Name);
        return (super.itemizehamburger()+healthyExtra1Price+healthyExtra2Price);
    }
}
