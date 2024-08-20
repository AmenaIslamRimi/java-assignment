// 11. Write a program that will take integer numbers as user input continuously
// and print the sum of numbers until user input q from the keyboard.
// When user input q, the program will be quit.
// If the user inputs another character, then the program will ask to input the number again.

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        sumOfNumbers();
    }

    public static void sumOfNumbers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.println("Total sum: " + sum);
    }

}

