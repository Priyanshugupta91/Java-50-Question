
    import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);  // Read the first character from input
            
            // Print ASCII value
            int ascii = (int) ch;
            System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        }
    }
}


