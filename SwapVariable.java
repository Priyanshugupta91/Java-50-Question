
import java.util.Scanner;

public class SwapVariable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the First Number: ");
            int a = scanner.nextInt();
            
            System.out.print("Enter the Second Number: ");
            int b = scanner.nextInt();
            
            System.out.println("Before swapping");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            
            int temp = a;
            a = b;
            b = temp;
            
            System.out.println("After swapping");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }    
}
