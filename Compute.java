
import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            String nStr = Integer.toString(n);
            int nn = Integer.parseInt(nStr+nStr);
            int nnn = Integer.parseInt(nStr+nStr+nStr);

            System.out.println(n+" + "+nn+" + "+nnn);

            int result = n + nn + nnn;
            System.out.println("Result: "+result);
        } 
        }
 
    }
