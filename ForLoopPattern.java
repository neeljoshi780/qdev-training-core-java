/**
 * Program to demonstrate the use of a for loop.
 * The program prints a pattern of stars in the shape of a right-angled triangle.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */

public class ForLoopPattern {

    public static void main(String[] args) {
        // Number of rows in the pattern
        int rows = 5;

        // Using a for loop to print the pattern
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  // Print a star
            }
            // After printing each row of stars, move to the next line
            System.out.println();
        }
    }

}