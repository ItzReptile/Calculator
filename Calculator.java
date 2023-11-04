import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter the operation (+, -, *, /) or 'exit' to quit:");

        while (true) {
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            if (!operation.matches("[+\\-*/]")) {
                System.out.println("Invalid operation. Please enter +, -, *, or /.");
                continue;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 0; // This shouldn't happen if the input is properly validated
            }

            System.out.println("Result: " + result);
            scanner.nextLine(); // Consume the newline character
            System.out.println("Enter the operation (+, -, *, /) or 'exit' to quit:");
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
