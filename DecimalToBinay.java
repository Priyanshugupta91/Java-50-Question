
import java.util.Scanner;

public class DecimalToBinay {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Integer Number: ");
            int num1 = scanner.nextInt();

            String Binary = Integer.toBinaryString(num1);
            System.out.println("Binary Number is "+Binary);
        }
    }
    
}
