/*Write a Java program which will display the following pattern.

* *
* *
* *
* *


*/
public class Pattern1 {
    public static void main(String[] args) {
        // Outer loop to iterate over rows (3 rows total)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) { // Inner loop to iterate over columns (2 columns total)
                System.out.print("* "); // Print an asterisk followed by a space

                if (j == 1) { // Continue condition for clarity (though redundant in this case)
                    continue;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
