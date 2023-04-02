package section13NestedClassesAndType.burger;

public class Store {
    public static void main(String[] args) {
        Meal regularMeal = new Meal();
        regularMeal.addToppings("ketchup","mayo","bacon");
        System.out.println(regularMeal);
        System.out.println("-".repeat(20));
        System.out.println("In India");
        Meal INRMeal = new Meal(Meal.IndianPrice);
        INRMeal.addToppings("bacon","avocado","mayo","ketchup","pickless");
        System.out.println(INRMeal);
    }
}
