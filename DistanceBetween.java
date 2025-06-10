import java.util.Scanner;

public class DistanceBetween {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            final double RADIUS = 6371.01; // Radius of Earth in kilometers

            // Input coordinates
            System.out.print("Enter latitude of coordinate 1: ");
            double x1 = Math.toRadians(scanner.nextDouble());
            System.out.print("Enter longitude of coordinate 1: ");
            double y1 = Math.toRadians(scanner.nextDouble());

            System.out.print("Enter latitude of coordinate 2: ");
            double x2 = Math.toRadians(scanner.nextDouble());
            System.out.print("Enter longitude of coordinate 2: ");
            double y2 = Math.toRadians(scanner.nextDouble());

            // Formula to calculate distance
            double distance = RADIUS * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
            );

            // Output
            System.out.printf("The distance between those points is: %.14f km\n", distance);
        }
    }
}

