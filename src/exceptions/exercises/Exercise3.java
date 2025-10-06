package exceptions.exercises;

/**
 * Exercise 3:
 * Ask the user to enter a number.
 * Convert the input from String to int using Integer.parseInt().
 * Catch NumberFormatException if the user enters invalid input.
 */

import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");


        try {
            String text = scanner.nextLine();
            int input = Integer.parseInt(text);
            System.out.println(input);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
