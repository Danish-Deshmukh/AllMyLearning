package Recursion.Sorting;
import java.util.Arrays;

public class ForDelete {
    public static void main(String[] args) {
        int[] arr = {55,44,3,22,11};
        mergeInPlace(arr, 0,arr.length);
        // System.out.println("Hello");
        System.out.println(Arrays.toString(arr));
    }
    static void mergeInPlace(int[] arr,int s,int e){
        if((e - s) == 1){
            return;
        }
        int m = (s + e) / 2;

        mergeInPlace(arr, s, m);
        mergeInPlace(arr, m, e);

        merge(arr,s,m,e);
    }
    static void merge(int[] arr,int s,int m,int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // If them also array is remaing
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
