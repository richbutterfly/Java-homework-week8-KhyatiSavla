package java_homework_week8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    // Main method to print statement
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scanner.next().toLowerCase(); // converting input values into lowercase


        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error.Not a single character.");
        } else if (!(lowercase)) {
            System.out.println("error (Entered value is not a character");
        } else if (vowels) {
            System.out.println("input letter is vowel");
        } else {
            System.out.println("Input letter is consonant");
        }

    }

}

