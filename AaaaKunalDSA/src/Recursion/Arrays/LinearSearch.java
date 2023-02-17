package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,4,6, 7, 1,4};
        int target = 4 ;
        System.out.println(search(arr, target, 0));
        System.out.println(searchIndex(arr,target,0));
        System.out.println(searchToLast(arr,target,arr.length-1));
        searchAll(arr,target,0);
        System.out.println(list);
        System.out.println(searchAll1(arr,target,0,new ArrayList<>()));
        System.out.println(searchAll2(arr,target,0));
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else return  searchIndex(arr, target, index + 1);
    }
    static int searchToLast(int[] arr, int target, int index) {
        if (index ==- 1) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else return  searchToLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll (int[] arr,int target, int index){
        if (index == arr.length){
            return ;
        }
        if (arr[index] == target){
            list.add(index);
        }
        searchAll(arr,target,index+1);
    }
    // In below function the ArrayList is passed in parameter and method type is arrayList
    static ArrayList<Integer> searchAll1 (int[] arr,int target, int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return searchAll1(arr,target,index+1,list);
    }
    static ArrayList<Integer> searchAll2 (int[] arr,int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans= searchAll2(arr,target,index+1);

        list.addAll(ans);
        return list;
    }
}
