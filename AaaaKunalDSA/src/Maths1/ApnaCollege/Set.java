package Maths1.ApnaCollege;

public class Set {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 1;
        int mask = 1<<position;
        int ans = mask | n;
        System.out.println(ans);
    }
}
