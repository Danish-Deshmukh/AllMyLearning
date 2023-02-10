package Recursion;

public class PrintNumberUsingRecersions {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
        if (n == 100){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n+1);
    }
}
