import java.util.Scanner;

public class BinaryToHexadeci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Binary Number: ");
            String Binary = scanner.nextLine();
            
            int decimal = Integer.parseInt(Binary, 2);
            String HexaDecimal = Integer.toHexString(decimal).toUpperCase();
            System.out.println("HexaDecimal number is "+HexaDecimal);
        }
    }    
}
