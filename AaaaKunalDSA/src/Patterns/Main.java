package Patterns;

public class Main {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(5);
        pattern5(5);
        pattern5_1(5);
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces  = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
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
    static void pattern2(int n){
        System.out.println("2)");
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("3)");
        for (int row = 0; row <= n; row++) {
            for (int col = n-row; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Kunal's solution
        System.out.println();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("4)");
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("5)");
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n-row; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Kunal's
    static void pattern5_1(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int tc;

            if (row > n){
                tc = 2 * n - row;
            }
            else tc = row;

            for (int col = 0; col < tc; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
