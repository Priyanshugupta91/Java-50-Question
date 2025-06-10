
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            
            double circleArea = Math.PI*radius*radius;
            double circlePerimeter = 2*Math.PI*radius;
            
            System.out.println("Area is: " + circleArea);
            System.out.println("Perimeter is: " + circlePerimeter);
        }
    }
}
