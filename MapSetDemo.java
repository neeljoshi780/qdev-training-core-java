import java.util.*;

/**
 * Demonstrates the use of Map and Set collections in Java with Iterators.
 * 
 * In this program, we:
 * 1. Create and populate a Map with key-value pairs, then print the Map contents using an Iterator.
 * 2. Create and populate a Set with unique elements, then print the Set contents using an Iterator.
 * 
 * This example showcases how to use a Map (HashMap) for storing key-value pairs and a Set (HashSet) for storing 
 * unique elements in Java, with iteration through both collections using Iterators.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-03
 */
public class MapSetDemo {

    public static void main(String[] args) {
        // --- Using Map (HashMap) ---
        // Creating a Map to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the Map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Printing Map using Iterator
        System.out.println("Map values (key-value pairs) using Iterator:");
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // --- Using Set (HashSet) ---
        // Creating a Set to store unique elements
        Set<String> set = new HashSet<>();

        // Adding elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        // Printing Set using Iterator
        System.out.println("\nSet values using Iterator:");
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }

}