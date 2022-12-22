import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character for ASCII value ");
        character = scanner.next().charAt(0);
//        int ascii = character;
        System.out.println("ASCII value of character is "+ (int) character);
    }
}
