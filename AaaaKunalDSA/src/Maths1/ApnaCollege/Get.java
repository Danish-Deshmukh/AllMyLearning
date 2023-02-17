package Maths1.ApnaCollege;

public class Get {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 3;
        int mask = 1<<position;
//        int ans = mask & n;
        if ((mask & n) == 0){
            System.out.println("Bit is zero");
        }
        else System.out.println("Bit is One");
    }
}
