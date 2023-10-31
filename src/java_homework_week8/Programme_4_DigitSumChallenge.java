package java_homework_week8;

import java.util.Scanner;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1+2+5=8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge
 */
public class Programme_4_DigitSumChallenge {

    public void sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10); // to get last digit answer sum with previous last digit
                number = number / 10; // to get remaining number after removing last digit
            }
            System.out.println("Addition of digits is: " + sum);
        } else {
            System.out.println(-1); // if number is not greater than equal to 10 then return -1
        }
    }

    // Main method to get input from user using scanner class object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 digit number");
        int number = scanner.nextInt();
        Programme_4_DigitSumChallenge obj = new Programme_4_DigitSumChallenge();
        obj.sumDigits(number);
        // Closing the scanner object
        scanner.close();
    }


}
