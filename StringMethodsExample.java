import java.util.Scanner;

/**
 * Demonstrates various String methods like charAt(), concat(), equals(),
 * toUpperCase(), toLowerCase(), substring(), indexOf(), replace(), and length().
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class StringMethodsExample {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
    
        // Take input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
    
        // charAt() - Get character at a specific position
        System.out.println("\n1. charAt(): ");
        System.out.println("Character at position 2: " + inputString.charAt(2));
    
        // concat() - Concatenate two strings
        System.out.println("\n2. concat(): ");
        String addedString = inputString.concat(" - Concatenated Text");
        System.out.println("Concatenated String: " + addedString);
    
        // equals() - Compare two strings for equality
        System.out.println("\n3. equals(): ");
        String anotherString = "Hello World";
        System.out.println("Is the input string equal to 'Hello World'? " + inputString.equals(anotherString));
    
        // toUpperCase() - Convert string to uppercase
        System.out.println("\n4. toUpperCase(): ");
        System.out.println("Uppercase String: " + inputString.toUpperCase());
    
        // toLowerCase() - Convert string to lowercase
        System.out.println("\n5. toLowerCase(): ");
        System.out.println("Lowercase String: " + inputString.toLowerCase());
    
        // substring() - Extract a substring from the string
        System.out.println("\n6. substring(): ");
        System.out.println("Substring from index 0 to 5: " + inputString.substring(0, 5));
    
        // indexOf() - Find the index of a character or substring
        System.out.println("\n7. indexOf(): ");
        System.out.println("Index of 'o': " + inputString.indexOf('o'));
        System.out.println("Index of 'World': " + inputString.indexOf("World"));
    
        // replace() - Replace a character or substring in the string
        System.out.println("\n8. replace(): ");
        String replacedString = inputString.replace("World", "Java");
        System.out.println("String after replace: " + replacedString);
    
        // length() - Get the length of the string
        System.out.println("\n9. length(): ");
        System.out.println("Length of the input string: " + inputString.length());
    
        // close the scanner
        scanner.close();
    }

}