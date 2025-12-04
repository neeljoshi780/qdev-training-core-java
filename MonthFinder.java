import java.util.Scanner;

/**
 * This program prompts the user to enter a number between 1 and 12 and then 
 * displays the corresponding month name based on the number entered. It uses 
 * a switch-case statement to map the numbers to their respective months.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class MonthFinder {
    public static void main(String[] args) {
        
        // Initialize Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number between 1 and 12
        System.out.print("Enter a number (1-12) to find the corresponding month: ");
        
        // Read the integer input (month number) from the user
        int monthNumber = scanner.nextInt(); 
        
        // Switch-case statement to print the corresponding month based on the input number
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break; // Exit the switch statement after printing the month
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                // Default case for invalid input
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        // Close the scanner object to free resources
        scanner.close();
    }
}