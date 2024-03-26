package mavendemo;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = CalculatorFunctions.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = CalculatorFunctions.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = CalculatorFunctions.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = CalculatorFunctions.divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
