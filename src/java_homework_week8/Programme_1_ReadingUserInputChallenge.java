package java_homework_week8;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum
 * Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * Create a class with the name ReadingUserInputChallenge.
 */
public class Programme_1_ReadingUserInputChallenge {
    // Main method to print statement
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        Programme_1_ReadingUserInputChallenge obj = new Programme_1_ReadingUserInputChallenge();
        obj.n1(scanner);
        //Closing the scanner object
        scanner.close();
    }

    public void n1(Scanner scanner) {
        int x = 1; // Entering number starts with 1
        int sum = 0; // assign value for sum

        while (x <= 10) {
            System.out.println("Enter number " + x + ":");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;  //logic for sum of the number
                x++;
            } else {
                System.out.println("Invalid input.Please enter a valid number");
            }
        }
        System.out.println("Sum of the entered number is: " + sum); //Print statement for sum

    }
}
