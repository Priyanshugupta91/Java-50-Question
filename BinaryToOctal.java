import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Binary Number: ");
            String Binary = scanner.nextLine();
            
            int decimal = Integer.parseInt(Binary, 2);
            String OctalDecimal = Integer.toOctalString(decimal).toUpperCase();
            System.out.println("Octal number is "+OctalDecimal);
        }
    }    
    
}
