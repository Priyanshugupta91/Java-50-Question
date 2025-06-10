import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Binary Number: ");
            String Binary = scanner.nextLine();
            
            int Decimal = Integer.parseInt(Binary, 2);
            System.out.println("Decimal number is "+Decimal);
        }
    }
    
}

