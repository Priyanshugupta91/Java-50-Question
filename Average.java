import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second Number: ");
            int num2 = scanner.nextInt();


            System.out.print("Enter third Number: ");
            int num3 = scanner.nextInt();   
            
            int average = (num1 + num2 + num3)/3;
            System.out.println("Average of three number is:"+average);
        }
    }
    
}
