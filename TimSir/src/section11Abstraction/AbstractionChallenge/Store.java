package section11Abstraction.AbstractionChallenge;

import java.util.ArrayList;


record OrderItem(int qty,ProductForSale product){}


public class Store {
       private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil painting",34299.9,"Impressionistic work " +
                "by Zaid Deshmukh in 2023"));
        storeProducts.add(new ArtObject("Sculpture",34999.9,"Bronze work " +
                "by Mubashshir Deshmukh in 2023"));
        storeProducts.add(new Furniture("Sofa",9999,"Large and Comfortable"));
        storeProducts.add(new Furniture("Table",999,"For study"));
        listProduct();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,0,1);
        addItemToOrder(order1,1,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,2,1);
        addItemToOrder(order2,3,1);
        printOrder(order2);
    }

    private static void listProduct() {

        for (int i = 0; i < storeProducts.size(); i++) {
            ProductForSale item = storeProducts.get(i);
            System.out.println("-".repeat(30));
            item.showDetail();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int qty) {
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = ₹%6.2f %n", salesTotal);
    }
}
