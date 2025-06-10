import java.util.Scanner;

public class HexaDecimalToOctal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a HexaDecimal Number: ");
            String HexaDecimal = scanner.nextLine();
            
            int Decimal = Integer.parseInt(HexaDecimal, 16);
            String octal = Integer.toOctalString(Decimal).toUpperCase();
            System.out.println("Equivalent Octal number is "+octal);
        }
    }
    
}
