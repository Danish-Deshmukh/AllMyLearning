package Maths1.ApnaCollege;

public class Clear {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 2;
        int mask = 1<<position;
        int not = ~mask;
        int ans = not & n;
        System.out.println(ans);
    }
}
