
    import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Binary Numner: ");
            String binary1 = scanner.nextLine();

            System.out.print("Enter Second Binary Numner: ");
            String binary2 = scanner.nextLine();
            
            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2,2);
            int sum = num1*num2;

            String BinaryMultiple = Integer.toBinaryString(sum);
            System.out.println("Product of two binary number is "+BinaryMultiple);
        } 
        }
    
    }   

    


    
