package section15NamingConventions._5AccessModifiers;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Danish");
        account.deposit(5000);
        account.deposit(500);
        account.withdraw(400);
        account.calcutateBalance();
    }
}
