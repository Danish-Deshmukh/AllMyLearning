package Algorithms.LinearSearch;

import java.util.Arrays;

public class Q1SearchInString {
    public static void main(String[] args) {

        String name = "Danish";
        char target = 'n';

        System.out.println(search(name,target));
        System.out.println(search2(name,target));

        // If you want to Print String in Array
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search (String str, char target){

        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    // Using enhanced for loop
    static boolean search2 (String str, char target){

        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
