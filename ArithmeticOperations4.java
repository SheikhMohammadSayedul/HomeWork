import java.util.Scanner;

public class ArithmeticOperations4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int distance = Math.abs(num1 - num2);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        // Print the results with proper alignment
        System.out.printf("Sum:       %8d%n", sum);
        System.out.printf("Difference:%8d%n", difference);
        System.out.printf("Product:   %8d%n", product);
        System.out.printf("Average:   %8.2f%n", average);
        System.out.printf("Distance:  %8d%n", distance);
        System.out.printf("Maximum:   %8d%n", maximum);
        System.out.printf("Minimum:   %8d%n", minimum);
    }
}
