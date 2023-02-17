package Recursion.Patterns;

public class Patterns {
    public static void main(String[] args) {
        traingle(0,1);
    }
    static int n = 5;
    static void traingle(int r,int c){

        traingle(r,c);
    }
    static void pattern1(int n){
        System.out.println("1)");
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
