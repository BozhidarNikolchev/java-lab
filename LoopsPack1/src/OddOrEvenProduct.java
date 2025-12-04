

import java.util.Scanner;

public class OddOrEvenProduct {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);
        // Read the amount of lines of input that we need to process
        int lines = Integer.parseInt(scanner.nextLine());
        // In the context of the problem, we can call a number "odd", if it is received as an input on an odd line
        // Declare a variable to store the product of all the "odd" lines
        // It starts from 1, because each number multiplied by one is equal to itself
        int productOddLines = 1;
        // In the context of the problem, we can call a number "even" if it is received as an input on an even line
        // Declare a variable to store the product of all the "even" lines
        // It starts from 1, because each number multiplied by one is equal to itself
        int productEvenLines = 1;

        // Read input
        // Process it until we read enough numbers, according to the lines variable value
        for (int i = 1; i <= lines; i++) {
            // Store the next number's value to the number variable
            int number = Integer.parseInt(scanner.nextLine());
            // Check if the number of processed numbers so far is odd or even
            // When using the modulus operator, we receive the remainder that is left after dividing two numbers
            // If we receive zero as a remainder when dividing our number by two, that means that the number that we are dividing is an even number
            // If we receive one as a remainder when dividing our number by two, that means that the number that we are dividing is an odd number
            // As a result, the first number is always odd, the second number is always even
            if (i % 2 != 0) {
                // Multiply the current number by the product of the other numbers received at an odd line that we processed so far
                productOddLines *= number;
            } else {
                // Multiply the current number by the product of the other numbers received at an even line that we processed so far
                productEvenLines *= number;
            }
        }

        // Here we check if the product of "odd" numbers is equal to the product of "even" numbers
        // After that, we print the result according to the problem description
        if (productOddLines == productEvenLines) {
            System.out.printf("yes %d%n", productOddLines);
        } else {
            System.out.printf("no %d %d%n", productOddLines, productEvenLines);
        }
    }
}

