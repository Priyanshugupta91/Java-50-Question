import java.util.Scanner;

public class OctalToHexaDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Octal Number: ");
            String Octal = scanner.nextLine();
            
            int decimal = Integer.parseInt(Octal, 8);
            String HexaDecimal = Integer.toHexString(decimal).toUpperCase();
            System.out.println("Equivalent HexaDecimal number is "+HexaDecimal);
        }
    }       
    
}
