
import java.util.Scanner;


public class HexagonArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of a side: ");
            int side = scanner.nextInt();

            double area = 6*side*side/(4*Math.tan(Math.PI/6));

            System.out.println("The area of Hexagon is: "+area);
        }


    }
    
}
