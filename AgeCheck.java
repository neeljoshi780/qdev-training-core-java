import java.util.Scanner; // Importing the Scanner class to capture user input

/**
 * Program to check if a user is an adult, minor, or invalid input based on their age.
 * The user is prompted to input their age, and the program will validate the input.
 * It then prints whether the user is an adult (18 or older), a minor (under 18),
 * or an invalid age (negative or zero age).
 * 
 * @author Neel Joshi
 * @version 1.1.0 Added additional input validation and edge cases handling
 * @since 2025-12-02
 */
public class AgeCheck {

    public static void main(String[] args) {
    
        // Initialize scanner object for user input
        Scanner scanner = new Scanner(System.in);
    
        // Prompt user to enter their age
        System.out.print("Please enter your age: ");
    
        // Check if the user entered a valid integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
            scanner.close();
            return; // Exit the program if input is not an integer
        }
    
        // Read the user's age input
        int age = scanner.nextInt(); // User's age input as an integer
    
        // Validate age to ensure it's a positive number
        if (age <= 0) {
            System.out.println("Invalid age entered. Age cannot be zero or negative.");
        } else if (age < 18) {
            // If the age is less than 18, user is a minor
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 130) {
            // If the age is 18 or older but within a reasonable upper limit (130 years)
            System.out.println("You are an adult.");
        } else {
            // If the age is greater than 130, it’s considered an invalid age
            System.out.println("Invalid age entered. Please enter a reasonable age (below 130 years).");
        }
    
        // Close the scanner to release resources
        scanner.close();
    }

}