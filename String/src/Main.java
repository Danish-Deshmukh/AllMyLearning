//    byte =   Rarely using
//    short =   Rarely using
//    int = more frequently using
//    long = Not Often using
//    float =   Rarely using
//    double = more frequently using
//    char  = Not Often using
//    boolean = more frequently using
public class Main {
    public static void main(String[] args) {


        int out = 1 + 1;
        System.out.println(out);
        String mystring = "This is a string";
        System.out.println("My String  is equal to " + mystring);
        mystring = mystring + " , and this is more. ";
        System.out.println("myString is equal to " + mystring);
        mystring = mystring + " \u00A9 2019";
        System.out.println("myString is equal to " + mystring);
        String numberString = "250.55\n";
        numberString = numberString + "\t49.95";
        System.out.println(numberString);
        String lastONe = "10";
        int myint = 50 + 60;
        lastONe = lastONe + myint;

        System.out.println("my last plus = " + lastONe);
        double doublenumber = 123.34;
        lastONe = lastONe + doublenumber;
        System.out.println(lastONe);
        String fake = "\u24b8";
        System.out.println(fake);





    }















}
