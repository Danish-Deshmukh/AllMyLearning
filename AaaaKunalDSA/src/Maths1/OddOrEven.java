package Maths1;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(isOddEven(n));
    }
    private static boolean isOddEven(int n) {
        return (n&1) == 1;
    }
}
