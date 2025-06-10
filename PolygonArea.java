
import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of sides of the polygon: ");
            int side = scanner.nextInt();

            System.out.print("Enter the length of the sides: ");
            int length = scanner.nextInt();

            double Area = (side*length*length)/(4*Math.tan(Math.PI/side));

            System.out.println("The Area is: "+Area);
        }
        
    }
    
}
