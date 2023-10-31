package java_homework_week8;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_NumberTriangle {

    public void pattern(int rows) { // instance method with one variable
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k); // Print statement
            }
            System.out.println(); // Print statement use to add new line after each row
        }
    }

    public static void main(String[] args) { // main method to print statement
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        Programme_6_NumberTriangle obj = new Programme_6_NumberTriangle();
        obj.pattern(rows);
        // Closing the scanner object
        scanner.close();
    }
}
