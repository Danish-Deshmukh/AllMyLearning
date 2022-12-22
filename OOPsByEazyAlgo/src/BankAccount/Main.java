package BankAccount;

public class Main {
    public static void main(String[] args) {
        Account DanishAccount = new Account("12345",0.0,"Danish","dd39775@gmail.com","7087492");
        DanishAccount.DepositMoney(50000);
        DanishAccount.WithDraw(5000);
        DanishAccount.WithDraw(100000);
    }
}
