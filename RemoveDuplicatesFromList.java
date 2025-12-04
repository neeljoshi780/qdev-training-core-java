import java.util.*;

/**
 * Demonstrates how to remove duplicate values from a List.
 * 
 * In this program, we:
 * 1. Create a List with duplicate string values.
 * 2. Use a Set to remove duplicates from the List.
 * 3. Convert the Set back to a List and print the unique values.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-03
 */
public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // --- Create a List with duplicate values ---
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");  // Duplicate value
        list.add("C");  // Duplicate value
        list.add("E");
        list.add("E");  // Duplicate value
        list.add("E");  // Duplicate value
    
        // Printing original List
        System.out.println("Original List:");
        for (String str : list) {
            System.out.println(str);
        }
    
        // --- Remove duplicates using a Set ---
        Set<String> set = new HashSet<>(list);  // Automatically removes duplicates
    
        // Converting the Set back to a List
        List<String> uniqueList = new ArrayList<>(set);
    
        // Printing the List after removing duplicates
        System.out.println("\nList after removing duplicates:");
        for (String str : uniqueList) {
            System.out.println(str);
        }
    }

}