import java.util.Scanner;

public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a HexaDecimal Number: ");
            String HexaDecimal = scanner.nextLine();
            
            int Decimal = Integer.parseInt(HexaDecimal, 16);
            System.out.println("Equivalent Decimal number is "+Decimal);
        }
    }
    
}
