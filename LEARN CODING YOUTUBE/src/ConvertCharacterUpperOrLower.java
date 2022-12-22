import java.util.Scanner;

public class ConvertCharacterUpperOrLower {
    public static void main(String[] args) {
        char character, print;
        while (true){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter character");
            character=scanner.next().charAt(0);
            if (character >='A' && character <='Z'){
                print = Character.toLowerCase(character);
                System.out.println(print);
            }else {
                print = Character.toUpperCase(character);
                System.out.println(print);
            }
        }
    }
}
