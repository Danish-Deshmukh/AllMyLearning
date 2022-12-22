package KunalKushwaha.BinarySearch.BinarySearchInterviewQuestions;

public class Q2FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        int key = -1;
        int ans = floorOfANumber(arr, key);
        System.out.println(ans);
    }
    // Floor is the greatest number less than equal to target
    static int floorOfANumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean ifAse;
        ifAse = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ifAse) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        System.out.print("Floor of a Number is ");
        return end ;
    }
}
