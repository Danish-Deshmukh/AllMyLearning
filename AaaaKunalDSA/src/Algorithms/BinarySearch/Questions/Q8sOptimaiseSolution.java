package Algorithms.BinarySearch.Questions;

public class Q8sOptimaiseSolution {
    public static void main(String[] args) {

        int[] arr = {4,5, 5, 6, 7, 0, 1,1,2, 2};
        int[] ar1 = {7, 0, 1, 2, 3, 5, 6};
        int[] ar2 = {1, 2};

        int[] ar3 = {3, 5, 1};

        int target = 7;
        System.out.println(sRSA(ar3, target));

//        System.out.println("FInding pivot");
//        System.out.println(peak(arr));
//        System.out.println(peak(ar1));
//        System.out.println(peak(ar2));

        System.out.println("Searching ");
        System.out.println(sRSA(arr, target));
        System.out.println(sRSA(ar1, target));
        System.out.println(sRSA(ar2, target));
    }

    // https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/3076946/java-recursive-solution-beats-100/
    public static int sRSA(int[] nums, int target) {
        int low=0,high=nums.length-1;
        return binarySearch(nums,low,high,target);
    }
    static public int binarySearch(int[] nums,int low,int high,int target){
        int mid=(low+high)/2,left=-1,right=-1;
        if(low<=high){
            if(nums[mid]==target)
                return mid;
            else{
                left=binarySearch(nums,low,mid-1,target);
                right=binarySearch(nums,mid+1,high,target);
            }
        }
        return Math.max(left,right);
    }

}
