package java_homework_week8;

import java.util.Scanner;

//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Programme_9_FibonacciNumber {
    public void isFibonacciNumber(int count) {
        int n1 = 0, n2 = 1, nextNumber; // declaring value for variables
        System.out.println(n1 + " "); // Printing number in fibonacci sequence
        for (int i = 2; i < count; i++) {
            nextNumber = n1 + n2; // Logic to get fibonacci number
            System.out.println(" " + nextNumber);
            n1 = n2;
            n2 = nextNumber;
        }
    }

    public static void main(String[] args) { // main method to print statement
        //Scanner creation for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count is: ");
        int f = scanner.nextInt();
        Programme_9_FibonacciNumber obj = new Programme_9_FibonacciNumber();
        obj.isFibonacciNumber(f); // object creation to call instance method to static method
        // Closing the scanner object
        scanner.close();
    }
}
