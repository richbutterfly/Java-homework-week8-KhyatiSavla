package java_homework_week8;

import java.util.Scanner;

/**
 * /**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14_DiamondPattern {

    public static void diamond() {
        int number = 7;
        int i = 1;
        int j;
        // While loop to print top part of the diamond
        while (i <= number) {
            j = 1;
            while (j <= number - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // While loop to print bottom part of the diamond
        i = number - 1;
        while (i > 0) {
            j = 1;
            while (j <= number - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) { // main method to print statement
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int number = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        char c = scanner.next().charAt(0);
        diamond(); // Static to static method direct calling
        //Closing the scanner object
        scanner.close();
    }
}
