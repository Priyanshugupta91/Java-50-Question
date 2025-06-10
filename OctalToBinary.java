import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Octal Number: ");
            String Octal = scanner.nextLine();
            
            int decimal = Integer.parseInt(Octal, 8);
            String Binary = Integer.toBinaryString(decimal).toUpperCase();
            System.out.println("Equivalent binary number is "+Binary);
        }
    }      
    
}
