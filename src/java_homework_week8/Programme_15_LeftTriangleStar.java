package java_homework_week8;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * <p>
 * *
 * * *
 * * * *
 * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void leftTriangle(int rows) {
        int i, j;
        // nested for loop
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Create main method to print the design
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = scanner.nextInt();
        leftTriangle(a);
        // Closing the scanner object
        scanner.close();
    }
}
