package exceptions.exercises;

import java.util.Scanner;

/**
 * Exercise 1:
 * Ask the user to input two numbers.
 * Divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message like "Cannot divide by zero!".
 */
public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        try {
            System.out.println("The division result is: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
    }
}
