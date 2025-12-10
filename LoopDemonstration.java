/**
 * Program to demonstrate the use of while loop and do-while loop.
 * The program prints numbers from 1 to 10 using both a while loop and a do-while loop.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */

public class LoopDemonstration {

    public static void main(String[] args) {

        // Demonstrating the use of a while loop to print numbers from 1 to 10
        System.out.println("Using while loop:");
        int i = 1;

        // While loop to print numbers from 1 to 10
        while (i <= 10) {
            System.out.print(i+",");  // Print the current value of i
            i++;  // Increment i to move to the next number
        }

        // Line break for better readability between the two loop outputs
        System.out.println();

        // Demonstrating the use of a do-while loop to print numbers from 1 to 10
        System.out.println("Using do-while loop:");
        int j = 1;

        // Do-while loop to print numbers from 1 to 10
        do {
            System.out.print(j+",");  // Print the current value of j
            j++;  // Increment j to move to the next number
        } while (j <= 10);  // The condition is checked after the loop execution, so it runs at least once

        // Line break for better readability between the two loop outputs
        System.out.println();
    }

}