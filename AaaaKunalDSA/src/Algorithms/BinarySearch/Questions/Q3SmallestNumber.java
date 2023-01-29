package Algorithms.BinarySearch.Questions;

public class Q3SmallestNumber {
    public static void main(String[] args) {
        char[] arr1 = {'c','f'};
        System.out.println(smallestNumber(arr1, 'd'));
    }

    static char smallestNumber(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        if (start == letters.length){
            return letters[0];
        }
        return letters[start];
    }
}
