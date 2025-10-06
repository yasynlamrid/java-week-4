package exceptions.exercises;
import java.util.Scanner;
/**
 * Exercise 2:
 * Create an int array with 5 elements.
 * Ask the user for an index to access.
 * Catch ArrayIndexOutOfBoundsException if the index is invalid.
 * Print an appropriate message instead of crashing.
 */



public class Exercise2 {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 3, 77, 4};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index: ");
        try {
            int input = scanner.nextInt();
            System.out.println("Value at index " + input + " is: " + intArray[input]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 4.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
