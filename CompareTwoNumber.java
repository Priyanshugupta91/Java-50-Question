
import java.util.Scanner;

public class CompareTwoNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();

            if(num1>num2)
                System.out.print(num1+ ">" +num2);
            else
                if(num1<num2)
                    System.out.print(num1+ "<" +num2);
                else
                    System.out.println("both are equal");
        }

            }
        }
    
    
