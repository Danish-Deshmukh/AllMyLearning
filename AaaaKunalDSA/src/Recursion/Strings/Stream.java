package Recursion.Strings;

import java.util.HashMap;

public class Stream {
    public static void main(String[] args) {
//        String st = "bbaaccabca";
//        skip("", st);
//        StringBuilder sb = new StringBuilder("Daninsh");
//        System.out.println(sb);
        StringBuilder str =new StringBuilder("aaaabcbaaa");
        System.out.println(isPalindrom(str));
    }
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p,up.substring(1));
        }
        else {
            skip(p + ch, up.substring(1));
        }
    }
    static boolean isPalindrom(StringBuilder str) {
        int s = 0;
        int e = str.length()-1;
        while (s < e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
class FibonacciMemoization {

    private static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

    public static long fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result;
        if (n <= 1) {
            result = n;
        } else {
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 100; // change this value to get the nth Fibonacci number
        long fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fib);
    }
}
