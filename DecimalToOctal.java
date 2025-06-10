
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Decimal Number: ");
            int num1 = scanner.nextInt();

            String HexaDecimal = Integer.toOctalString(num1);
            System.out.println("Octal number is "+HexaDecimal);
        }
    }
    
}

