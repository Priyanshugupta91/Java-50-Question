
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if(number%2==0){
                System.out.println("1");
            }
            else
                System.out.println("0");
        }

    
    }
    
}
