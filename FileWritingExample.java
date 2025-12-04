import java.io.*;

/**
 * Demonstrates how to create a text file and write personal details to it.
 * 
 * In this program, we:
 * 1. Create a text file named "myTestFile.txt".
 * 2. Write personal details (name, age, email, etc.) into the file.
 * 3. Handle exceptions and ensure proper file closing.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-03
 */
public class FileWritingExample {

    public static void main(String[] args) {
        // Personal details to be written into the file
        String name = "Neel Joshi";
        int age = 21;
        String email = "neeljoshi780@gmail.com";
        String address = "Ashram Road, Ahmedabad, Gujarat, India";
    
        // File object to represent the text file
        File file = new File("myTestFile.txt");
    
        // Declare the BufferedWriter outside the try block
        BufferedWriter writer = null;
    
        try {
            // Initialize BufferedWriter
            writer = new BufferedWriter(new FileWriter(file));
        
            // Writing the personal details to the file
            writer.write("Personal Details:\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Address: " + address + "\n");
        
            // Confirmation message
            System.out.println("Personal details successfully written to the file 'myTestFile.txt'.");
        } catch (IOException e) {
            // Handling any I/O exceptions
            System.err.println("Error while writing to the file: " + e.getMessage());
        } finally {
            // Explicitly closing the resource in the finally block
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error while closing the writer: " + e.getMessage());
            }
        }
    }

}