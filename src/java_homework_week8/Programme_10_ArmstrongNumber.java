package java_homework_week8;

// 10. Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    //Main method where input has been taken from user using scanner class object
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        isArmstrongNumber(num); // Static to static method calling direct
        // Closing the scanner object
        scn.close();
    }

    public static void isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0;
        originalNumber = num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10; // taking out last digit by modulus
            result += Math.pow(remainder, 3); // taking power of 3 of trace number
            originalNumber /= 10; // discarding the last digit for the future process
        }
        // Checking originalNumber and result are equal
        if (num == result) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

    }
}
