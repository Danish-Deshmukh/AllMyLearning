package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("hellow");
        int n = 46;
        int ans = fibo(n);
        System.out.print("nth fibo is ");
        System.out.println(ans);
        System.out.println(fiboFormula(n));
    }
    static int fibo (int n){
        if (n <= 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int fiboFormula(int n){
        // just for demo, use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
//  0 1 2 3 4 5 6 7  8  9  10
//  0 1 1 2 3 5 8 13 21 34 55