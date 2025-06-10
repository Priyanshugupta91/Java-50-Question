public class division {
        public static void main(String[] args) {
            int num1 = 50;  // Numerator
            int num2 = 3;   // Denominator
    
            if (num2 != 0) {
                int result = num1 / num2;  // Perform division
                System.out.println("The division of " + num1 + " by " + num2 + " is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
    
