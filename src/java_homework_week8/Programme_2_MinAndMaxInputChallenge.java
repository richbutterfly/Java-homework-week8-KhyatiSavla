package java_homework_week8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public void m1(Scanner scanner) {
        int min = Integer.MIN_VALUE; //method use in Java to find min value
        int max = Integer.MAX_VALUE; // method use in Java to find max value

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
        }
        //Print statement to get output
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        Programme_2_MinAndMaxInputChallenge obj = new Programme_2_MinAndMaxInputChallenge();
        obj.m1(scanner);
        //Closing the scanner object
        scanner.close();
    }
}
