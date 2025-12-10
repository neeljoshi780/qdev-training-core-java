import java.util.Scanner;

/**
 * Compare two variables of Wrapper class using Wrapper classes.
 * This program demonstrates how to compare two Integer objects using both the equals() method and the compareTo() method.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class WrapperComparison {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for two integers
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Create Integer objects (Wrapper classes)
        Integer wrapperNum1 = Integer.valueOf(num1);
        Integer wrapperNum2 = Integer.valueOf(num2);

        // Comparing the integers using the equals() method
        System.out.println("\nComparison using equals() method:");
        if (wrapperNum1.equals(wrapperNum2)) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

        // Comparing the integers using the compareTo() method
        System.out.println("\nComparison using compareTo() method:");
        int comparisonResult = wrapperNum1.compareTo(wrapperNum2);
        if (comparisonResult == 0) {
            System.out.println("The numbers are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("The first number is smaller.");
        } else {
            System.out.println("The first number is larger.");
        }

        // Close the scanner
        scanner.close();
    }

}