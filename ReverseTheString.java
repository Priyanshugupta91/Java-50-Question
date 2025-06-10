
import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a String:" );
            String input = scanner.nextLine();

            String Reverse = new StringBuilder(input).reverse().toString();

            System.out.println("Reversed String: "+Reverse);
        }
    }   
}
