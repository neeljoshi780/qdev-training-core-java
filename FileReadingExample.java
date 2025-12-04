import java.io.*;

/**
 * Demonstrates how to read data from a file using File Handling, Loops, String Handling, and Exception Handling.
 * 
 * In this program, we:
 * 1. Open the file "myTestFile.txt" for reading.
 * 2. Read the contents of the file line by line using BufferedReader.
 * 3. Display the contents on the console.
 * 4. Ensure proper closing of resources in the finally block.
 * 5. Handle any exceptions that may occur while reading the file.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-03
 */
public class FileReadingExample {

    public static void main(String[] args) {
        // File object to represent the text file
        File file = new File("myTestFile.txt");
    
        // Declare the BufferedReader outside the try block for manual closing
        BufferedReader reader = null;
    
        try {
            // Initialize the BufferedReader
            reader = new BufferedReader(new FileReader(file));
        
            String line;
        
            // Read and display the contents line by line using a loop
            System.out.println("Reading data from 'myTestFile.txt':");
        
            // Loop through the file content line by line
            while ((line = reader.readLine()) != null) {
                // String handling: Trim leading/trailing spaces and display the line
                System.out.println(line.trim());
            }
        } catch (FileNotFoundException e) {
            // Handling the case where the file is not found
            System.err.println("Error: The file 'myTestFile.txt' was not found.");
        } catch (IOException e) {
            // Handling other I/O exceptions (e.g., error while reading the file)
            System.err.println("Error while reading from the file: " + e.getMessage());
        } finally {
            // Ensure the BufferedReader is closed in the finally block
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // Handle any exception that might occur while closing the resource
                System.err.println("Error while closing the BufferedReader: " + e.getMessage());
            }
        }
    }

}