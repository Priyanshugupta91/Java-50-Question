import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Octal Number: ");
            String Octal = scanner.nextLine();
            
            int decimal = Integer.parseInt(Octal, 8);
            
            System.out.println("Equivalent Decimal number is "+decimal);
        }
    }      
    
}
