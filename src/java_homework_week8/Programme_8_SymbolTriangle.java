package java_homework_week8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {

    public void triangle(int rows) { // instance method with one parameter
        //Nested for loop
        for (int i = 0; i <= rows; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("@ ");
            }
            System.out.println(); // Print statement use to add new line after each row
        }
    }

    public static void main(String[] args) {
        //Scanner creation for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: "); // print statement to enter symbol
        int rows = scanner.nextInt();
        Programme_8_SymbolTriangle obj = new Programme_8_SymbolTriangle();
        obj.triangle(rows);
        //Closing the scanner object
        scanner.close();
    }
}
