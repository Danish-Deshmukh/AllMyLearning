package section10ListArrayListLinkedlist;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name,double intialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transaction.add(intialDeposit);
    }
}
public class AutoboxingUnboxingChallenge {
    public static void main(String[] args) {
        Customer bod = new Customer("Bob",1000);
        System.out.println(bod);


        Bank bank = new Bank("BOI");
        bank.addNewCustomer("Danish",500);
        System.out.println(bank);
        bank.addNewCustomer("Muba",511);
        System.out.println(bank);
        bank.addTransaction("Danish",411);
        System.out.println(bank);
        bank.addTransaction("Danish",-10);
        bank.addTransaction("Danish",-11);
        bank.printStatment("danish");
        bank.printStatment("muba");
        bank.addTransaction("dd",41);
    }
}
class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCutomer(String customerName) {
        for (var cutomer : customers) {
            if (cutomer.name().equalsIgnoreCase(customerName)) {
                return cutomer;
            }
        }
        System.out.println(customerName+" was not found");
        return null;
    }
    public void addNewCustomer(String customerName , double initialDeposit) {
        if (getCutomer(customerName) == null) {
            Customer customer = new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New cutomer added: " + customer);
        }
    }
    public void addTransaction(String name , double transactionAmount) {
        Customer customer = getCutomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);
        }
    }
    public void printStatment(String name) {
        Customer customer = getCutomer(name);
        if (customer == null) {
            System.out.println("not found");
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transaction()) {
            System.out.printf("₹%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
        }
    }
}