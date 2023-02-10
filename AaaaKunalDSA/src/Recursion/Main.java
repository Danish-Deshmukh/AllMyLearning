package Recursion;

public class Main {
    public static void main(String[] args) {
        message(1);
    }
    static void message(int n){
        if (n == 5){
            System.out.println("Hello world");
            return;
        }
        System.out.println("Hello world");
        message(n+1);
    }
}
