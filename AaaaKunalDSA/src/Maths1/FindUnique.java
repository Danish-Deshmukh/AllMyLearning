package Maths1;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(unique(arr));
        System.out.println(u(arr));
        System.out.println(Math.sqrt(36));
    }
    private static int unique(int[] arr) {
        int unique = 0;
        for (int elements: arr) {
            unique ^=elements;
        }
        return unique;
    }

    static int u (int[] arr){
        int u = 0;
        for (int i = 0; i < arr.length; i++) {
            u = u ^ arr[i];
        }
        return u;
    }
}
