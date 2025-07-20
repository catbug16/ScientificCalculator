import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        performAddition(scanner);
                        break;
                    case 2:
                        performSubtraction(scanner);
                        break;
                    case 3:
                        performMultiplication(scanner);
                        break;
                    case 4:
                        performDivision(scanner);
                        break;
                    case 0:
                        System.out.println("Exiting calculator. Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid number.");
                }


            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System. out.print("Choose an operation: ");
    }

    // Method to perform the addition and display result
    public static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);
        System.out.println("Result: " + result);
    }

    // Method to calculate the sum of two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }


    // Method to handle user input and display subtraction result
    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = subtract(num1, num2);
        System.out.println("Result: " + result);
    }

    // Method to calculate the difference of two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to handle user input and display multiplication result
    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = multiply(num1, num2);
        System.out.println("Result: " + result);
    }


    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to handle user input and display division result
    public static void performDivision(Scanner scanner) {
        System.out.print("Enter the numerator: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double num2 = scanner.nextDouble();

        double result = divide(num1, num2);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }


}
