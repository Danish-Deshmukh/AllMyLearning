package KunalKushwaha.LinearSearch;public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 70, 90, 50};
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(arr, key));
    }

    public static int linearSearch(int[] arr, int key) {
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
