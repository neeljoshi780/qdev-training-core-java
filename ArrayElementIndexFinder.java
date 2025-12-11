import java.util.Scanner;

/**
 * This program demonstrates how to find the index of a specific element in an array.
 * It uses a linear search technique to check each element of the array until the desired element is found.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class ArrayElementIndexFinder {

    // Method to find the index of a given element in the array
    public static int findElementIndex(int[] arr, int element) {
        // Loop through the array to find the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;  // Return the index if element is found
            }
        }
        return -1;  // Return -1 if the element is not found in the array
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Array initialization
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Asking the user for the element to find
        System.out.print("Enter the element to find in the array: ");
        int element = scanner.nextInt();

        // Calling the method to find the index of the element
        int index = findElementIndex(array, element);

        // Checking if the element was found
        if (index != -1) {
            System.out.println("Element " + element + " found at index " + index + ".");
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }

        // Closing the scanner object
        scanner.close();
    }

}