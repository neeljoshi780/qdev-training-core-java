/**
 * Program to demonstrate the use of constructors and parameterized constructors.
 * The program accepts two integer parameters via the parameterized constructor,
 * and applies a mathematical operation (e.g., sum, product, etc.) on those numbers.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */

public class Calculator {

    // Instance variables
    int num1;
    int num2;

    // Default constructor (no parameters)
    public Calculator() {
        num1 = 20;
        num2 = 5;
        System.out.println("Default constructor called: num1 = " + num1 + ", num2 = " + num2);
    }

    // Parameterized constructor (accepts two integers)
    public Calculator(int num1, int num2) {
        this.num1 = num1;  // Using 'this' to refer to instance variables
        this.num2 = num2;
        System.out.println("Parameterized constructor called: num1 = " + num1 + ", num2 = " + num2);
    }

    // Method to calculate the sum
    public int add() {
        return num1 + num2;
    }

    // Method to calculate the difference
    public int subtract() {
        return num1 - num2;
    }

    // Method to calculate the product
    public int multiply() {
        return num1 * num2;
    }

    // Method to calculate the division (handling divide by zero)
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return 'Not-a-Number' if division by zero
        }
    }

    // Main method to test the constructors and mathematical operations
    public static void main(String[] args) {
        
        // Calling the default constructor
        Calculator calc1 = new Calculator();  // This will use the default constructor
        
        // Perform operations using the default constructor's
        System.out.println("Sum: " + calc1.add());
        System.out.println("Difference: " + calc1.subtract());
        System.out.println("Product: " + calc1.multiply());
        System.out.println("Division: " + calc1.divide());

        
        // Calling the parameterized constructor with two integer arguments
        Calculator calc2 = new Calculator(10, 5);  // This will use the parameterized constructor
        
        // Perform operations using the parameterized constructor's values
        System.out.println("Sum: " + calc2.add());            // Sum of 10 and 5
        System.out.println("Difference: " + calc2.subtract()); // Difference of 10 and 5
        System.out.println("Product: " + calc2.multiply());    // Product of 10 and 5
        System.out.println("Division: " + calc2.divide());     // Division of 10 by 5
    }
}