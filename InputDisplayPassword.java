
import java.util.Scanner;

public class InputDisplayPassword {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Your Password: ");
            String password =  scanner.nextLine();

            String display = password;
            System.out.println("Your password is: "+display);
        }
    }
    
}
