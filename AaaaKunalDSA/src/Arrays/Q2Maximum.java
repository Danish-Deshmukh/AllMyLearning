package Arrays;
public class Q2Maximum {
    public static void main(String[] args) {

//        int[] arr = {};
        int[] arr = {1,2,3,4,5,1,3,4,6,7,8,912,1211,4,2,23656};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 1, 3));

    }
    private static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    private static int maxInRange(int[] arr, int start, int end) {

        if (arr.length == 0){
            return -1;
        }
        if (start > end) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
