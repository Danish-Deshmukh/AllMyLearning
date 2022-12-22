import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A character ");
        character = scanner.next().charAt(0);
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
                character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' ||
                character == 'U') {
            System.out.println("Vowel");
        }else System.out.println("Consonant");
    }
}
