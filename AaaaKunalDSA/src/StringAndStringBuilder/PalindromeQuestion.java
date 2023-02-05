package StringAndStringBuilder;

public class PalindromeQuestion {
    public static void main(String[] args) {
        String s = "abcdcbae";
        System.out.println(isPalindrome(s));
    }
    // Using ForLoop
    static boolean isPalindrome (String str){
        if (str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }
    // Using whileLoop
    static  boolean isPalindrome1 (String str){
        if (str == null || str.length()==0){
            return true;
        }
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            else if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
        }
        return true;
    }
}
