/**
 * Program to demonstrate the use of break and continue statements.
 * The program loops through 10 numbers and stops after 7 numbers and skips a specific number (e.g., 5).
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */

public class BreakContinueExample {

    public static void main(String[] args) {
        // Looping through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            
            // Skip the number 5 using continue
            if (i == 5) {
                continue;  // Skip the current iteration when i is 5
            }
            
            // Stop after printing 7 numbers using break
            if (i > 7) {
                break;  // Exit the loop after 7 numbers
            }
            
            // Print the current number
            System.out.println(i);
        }
    }

}