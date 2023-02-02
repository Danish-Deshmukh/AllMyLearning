package Algorithms.BinarySearch.SearchInMatrix;

public class Q2SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    }
    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            binarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row -1;
        int cmid = col /2;

        while (rStart < (rEnd -1)){

            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cmid] == target){
                return new int[] {mid,cmid};
            }

            // now we have two rows
            // check whether mid contains target or not
            if (matrix[rStart][cmid] == target){
                 return new int[] {rStart,cmid};
            }
            if (matrix[rStart+1][cmid] == target){
                 return new int[] {rStart+1,cmid};
            }

            // For cases
            if (target <= matrix[rStart][cmid - 1]){

            }
            if (target >= matrix[rStart + 1][cmid]){

            }
            if (target >= matrix[rStart + 1][cmid -1]){

            }else {

            }
        }
        return new int[] {-1,-1};
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart < cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new  int[] {-1,-1};
    }
}
