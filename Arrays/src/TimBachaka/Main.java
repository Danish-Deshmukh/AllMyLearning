package TimBachaka;

public class Main {
    public static void main(String[] args) {
        int[] myDanny = {1,2,3,4,5,6,7,8,9,10};


        int [] myIntArray = new int[11];
        int n = 3;
        for (int i=0; i<myIntArray.length ; i++) {

            myIntArray[i] = i*n;
//            System.out.println(i);
        }
        for (int i=0; i<myIntArray.length; i++){
            System.out.println(n+" Element "+i+", value is "+myIntArray[i]);
        }
        System.out.println(myDanny[0]);
        System.out.println(myDanny[9]);
        System.out.println(myDanny[0]);
        System.out.println(myDanny[0]);
    }
    public static void pirntArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println();

        }
    }
}
