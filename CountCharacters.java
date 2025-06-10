import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("The string is: ");
            String str = scanner.nextLine();

    
            int letters = 0, digits = 0, spaces = 0, others = 0;

            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isLetter(ch)) {
                    letters++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (Character.isWhitespace(ch)) {
                    spaces++;
                } else {
                    others++;
                }
            }

            // Output results
            System.out.println("Letters: " + letters);
            System.out.println("Number: " + digits);
            System.out.println("Space: " + spaces);
            System.out.println("Other: " + others);
        }

        
    }
}


