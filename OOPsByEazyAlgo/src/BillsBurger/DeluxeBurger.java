package BillsBurger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {

        super ("Dulexe","Bacon Cheese",19.10,"GarlicBread");
        super.addHamburgerAddition1("Chips",0);
        super.addHamburgerAddition2("Drinks",0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be add to DuluxeBurger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be add to DuluxeBurger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be add to DuluxeBurger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be add to DuluxeBurger");
    }
}
