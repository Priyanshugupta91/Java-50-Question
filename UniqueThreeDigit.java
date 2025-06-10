public class UniqueThreeDigit {
    public static void main(String[] args) {

        int count = 0;

        // Loop for the first digit
        for (int i = 1; i <= 4; i++) {
            // Loop for the second digit
            for (int j = 1; j <= 4; j++) {
                // Loop for the third digit
                for (int k = 1; k <= 4; k++) {
                    // Check if all digits are different
                    if (i != j && j != k && i != k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total unique 3-digit numbers: " + count);
    }
}

