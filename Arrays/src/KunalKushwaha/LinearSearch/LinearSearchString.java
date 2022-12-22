package KunalKushwaha.LinearSearch;

 class LinearSearchString {
    public static void main(String[] a) {

        String name = "Danish";
        char target = 'i';
        System.out.println(linearSearchChar(name,target));
    }
    public static boolean linearSearchChar (String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
