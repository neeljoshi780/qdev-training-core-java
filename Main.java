import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a Map (HashMap in this case)
        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", "Alice");
        myMap.put("age", "30");
        myMap.put("city", "New York");

        // Iterating through the map
        // Method 1: Using for-each loop (keySet)
        System.out.println("Iterating through keys:");
        for (String key : myMap.keySet()) {
            System.out.println(key);
        }

        // Method 2: Using for-each loop (values)
        System.out.println("\nIterating through values:");
        for (String value : myMap.values()) {
            System.out.println(value);
        }

        // Method 3: Using for-each loop (entrySet)
        System.out.println("\nIterating through key-value pairs:");
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}