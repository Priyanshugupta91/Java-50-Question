import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();
            
            System.out.print("Multiplication Table of" + number + ":");
            for (int i = 1; i<= 10; i++){
                int product = number*i;
                System.out.println(number +"x"+i+"="+ product);
            }
        }
    }
    
}
