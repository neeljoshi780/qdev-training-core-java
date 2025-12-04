import java.util.Scanner;

/**
 * This program demonstrates exception handling in Java using the following keywords:
 * - **try**: To define a block of code that might throw an exception.
 * - **catch**: To handle the exception.
 * - **finally**: To execute a block of code after the try and catch blocks, regardless of whether an exception occurred or not.
 * - **throw**: To explicitly throw an exception.
 * - **throws**: To declare that a method may throw an exception.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class ExceptionHandlingDemo {

    // Method that throws an exception
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Using the throw keyword to explicitly throw an exception
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Try block to catch potential exceptions
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Calling a method that throws an exception
            checkAge(age);

            // Try to divide by zero (ArithmeticException)
            System.out.println("10 / 0 = " + (10 / 0));
        } catch (ArithmeticException e) {
            // Catch block to handle arithmetic exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            // Catch block to handle illegal argument exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch block for general exceptions
            System.out.println("Error: Something went wrong.");
        } finally {
            // Finally block that will always execute
            System.out.println("\nThis block is always executed, regardless of exceptions.");
        }

        // Close the scanner object
        scanner.close();
    }
}