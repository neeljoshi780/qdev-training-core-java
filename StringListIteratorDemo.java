import java.util.*;

/**
 * Demonstrates the use of a List to store string values and the use of an Iterator to traverse and print the elements.
 * 
 * In this program, we create a List of Strings, add several string values to it, and then use an Iterator to 
 * print all the values stored in the List.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-03
 */
public class StringListIteratorDemo {

    public static void main(String[] args) {
        // Creating a List to store String values
        List<String> list = new ArrayList<>();
    
        // Adding String values to the List
        list.add("Hello");
        list.add("Neel");
        list.add("Joshi");
        list.add("India");
    
        // Creating an Iterator to iterate through the List
        Iterator<String> iterator = list.iterator();
    
        // Printing all values using the Iterator
        System.out.println("List values using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}