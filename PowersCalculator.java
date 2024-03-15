import java.util.Scanner;

public class PowersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate square, cube, and fourth power
        double square = number * number;
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        // Display the results
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);
        
        scanner.close();
    }
}
