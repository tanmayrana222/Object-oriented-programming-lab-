import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;
        int num1 = 0, num2 = 0;
        int choice = 0;

        while (!isValidInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();

                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");

        isValidInput = false;
        while (!isValidInput) {
            try {
                choice = scanner.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                scanner.nextLine(); 
            }
        }

        int result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}