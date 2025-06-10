import java.util.Scanner;

public class HexaDecimalToBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a HexaDecimal Number: ");
            String HexaDecimal = scanner.nextLine();
            
            int Decimal = Integer.parseInt(HexaDecimal, 16);
            String Binary = Integer.toBinaryString(Decimal).toUpperCase();
            System.out.println("Equivalent Binary number is "+Binary);
        }
    }
    
}
