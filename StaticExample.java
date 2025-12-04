/**
 * Demonstrates the use of static variables, methods, and blocks in Java.
 * 
 * This class includes examples of:
 * 1. **Static Variables**: A variable that is shared by all instances of the class.
 * 2. **Static Methods**: A method that can be invoked without creating an instance of the class and can only access static members of the class.
 * 3. **Static Blocks**: A block of code that runs once when the class is loaded into memory and is used for static initialization.
 * 
 * The program demonstrates:
 * - Accessing and modifying static variables using static methods.
 * - Accessing instance variables using instance methods.
 * - The difference between static and instance-level members.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class StaticExample {

    // Static variable
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    // Static block: runs once when the class is loaded
    static {
        System.out.println("Static Block: Class is loaded into memory.");
        staticCount = 10; // Initializing static variable in static block
    }

    // Static method
    public static void displayStaticMessage() {
        System.out.println("This is a static method.");
        System.out.println("Static Count: " + staticCount); // Accessing static variable in static method
    }

    // Instance method
    public void displayInstanceMessage() {
        System.out.println("This is an instance method.");
        System.out.println("Instance Count: " + instanceCount); // Accessing instance variable in instance method
    }

    // Instance method to increment the instance count
    public void incrementInstanceCount() {
        instanceCount++;
    }

    // Static method to increment the static count
    public static void incrementStaticCount() {
        staticCount++;
    }

    public static void main(String[] args) {
        // Access static method without creating an object
        StaticExample.displayStaticMessage();

        // Create an object of StaticExample to demonstrate instance variables and methods
        StaticExample obj1 = new StaticExample();
        obj1.displayInstanceMessage();
        obj1.incrementInstanceCount(); // Increment instance variable
        obj1.displayInstanceMessage(); // Display updated instance variable

        // Create another object of StaticExample
        StaticExample obj2 = new StaticExample();
        obj2.incrementInstanceCount(); // Increment instance variable
        obj2.displayInstanceMessage(); // Display updated instance variable

        // Demonstrate static variable behavior
        System.out.println("Static Count after 2 increment calls: " + staticCount);
        StaticExample.incrementStaticCount(); // Increment static variable using static method
        System.out.println("Static Count after static method call: " + staticCount);
    }

}