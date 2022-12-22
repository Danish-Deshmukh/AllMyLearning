public class Main {
    public static void main(String[] args){
        
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Valu = " + myMinFloatValue);
        System.out.println("Float Maximum Valu = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Valu = " + myMinDoubleValue);
        System.out.println("Double Maximum Valu = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue =  5 / 3f ;
        double myDoubleValue = 5 / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double poundsToKG = 0.45359237d;
        System.out.println("Pound to Kg = " + poundsToKG*3);
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilgrams = " + convertedKilograms);

        double fi = 22d / 7;
        System.out.println(fi);



    }
}
