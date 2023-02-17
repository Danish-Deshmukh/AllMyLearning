package Maths1.ApnaCollege;

public class Update {
    public static void main(String[] args) {
        int n = 5;
        int up = 1;
        int postion = 1;
        int mask = 1<<postion;
        update(n,up,mask);
    }
    static void update (int n,int up,int mask){

        if (up == 0){
            int not = ~mask;
            int ans = not & n;
            System.out.println(ans);
        }else if(up == 1) {
            System.out.println(mask | n);
        }else System.out.println("Either 1 Or 0 only");
    }
}
