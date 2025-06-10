import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Width of Rectangle: ");
            double width = scanner.nextDouble();

            System.out.print("Enter the Height of Rectangle: ");
            double height = scanner.nextDouble();

            double rectangleArea = width*height;
            double rectanglePerimeter = 2*(width+height);

            System.out.println("Area is: "+ rectangleArea);
            System.out.println("Perimeter is: "+ rectanglePerimeter);
        }

        
    }
}
