package KunalKushwaha.LinearSearch;

public class MaxWealth  {
    public static void main(String[] args) {
        int [][] arr = {
                {},
                {},
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts){
        // person = rol;
        // account = col;
        int ans  = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
