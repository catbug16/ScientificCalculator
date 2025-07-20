import java.util.Scanner;

public class ScientificCalculator {

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

    public static void displayMenu() {
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("1. Add");
        System.out.println("0. Exit");
        System. out.print("Choose an operation: ");
    }

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
}
