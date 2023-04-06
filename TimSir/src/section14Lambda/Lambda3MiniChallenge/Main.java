package section14Lambda.Lambda3MiniChallenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Hello world something");
        System.out.println("------------------");
        printWordsLambda.accept("Hello world something");
        System.out.println("------------------");

        Consumer<String> printWordsForEach = sentence -> {
          String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        printWordsForEach.accept("Hello world something");
        System.out.println("------------------");

        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
        printWordsConcise.accept("Hello world something");
        System.out.println("------------------");

        UnaryOperator<String> everySecondChar = source -> {

            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondChar.apply("1234567890"));

        System.out.println("--------------");
       String s =  everySecondCharacter(everySecondChar , "1234567890");
        System.out.println(s);


        System.out.println("""
                
                Write a lambda expression that is declared with the Supplier interface
                This lambda should return the String, " I love java ", and assign it to 
                a variable called, ILoveJava.
                 
                """);
        System.out.println("----------------");
        Supplier<String> loveJava = () -> "I love java";

        System.out.println(loveJava.get());
    }
    public static String everySecondCharacter(Function<String, String> func,
                                              String source) {
        return func.apply(source);
    }
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
}
