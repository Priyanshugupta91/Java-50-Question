
import java.util.Scanner;


public class basicarithmetic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number ");
            double num2 = scanner.nextDouble();
            
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double division = num1 / num2;
            double remainder = num1 % num2;
            
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        }

  }


    
}
