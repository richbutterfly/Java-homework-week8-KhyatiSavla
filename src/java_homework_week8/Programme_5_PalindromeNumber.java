package java_homework_week8;

import java.util.Scanner;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc.
 */
public class Programme_5_PalindromeNumber {
    public static void isPalindrome(int num) { // Static method with one parameter
        int reversedNum = 0, reminder;

        int originalNum = num; // store the number to originalNum
        while (num != 0) {
            reminder = num % 10;
            reversedNum = reversedNum * 10 + reminder;
            num /= 10;
        }
        // check if originalNum and reversedNum is equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome"); // Print statement
        } else {
            System.out.println(originalNum + " is not Palindrome"); // Print statement
        }
    }

    public static void main(String[] args) {
        // Main method where input has been taken from using scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        isPalindrome(num);
        // Closing the scanner object
        sc.close();
    }
}
