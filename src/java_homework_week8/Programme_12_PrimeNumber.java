package java_homework_week8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {

    public void isPrimeNumber(int num) {
        if (num <= 1) { // 1 and less than one number is not a prime number
            System.out.println(num + " is not a prime number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else
            System.out.println(num + " is not a Prime number");
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        Programme_12_PrimeNumber obj = new Programme_12_PrimeNumber();
        obj.isPrimeNumber(a);
        // Closing the scanner object
        scanner.close();
    }
}
