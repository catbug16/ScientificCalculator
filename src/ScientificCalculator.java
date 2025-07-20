import java.util.Scanner;
import java.util.InputMismatchException;

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
                    case 5:
                        performSquareRoot(scanner);
                        break;
                    case 6:
                        performPower(scanner);
                        break;
                    case 7:
                        performSine(scanner);
                        break;
                    case 8:
                        performCosine(scanner);
                        break;
                    case 9:
                        performTangent(scanner);
                        break;
                    case 10:
                        performNaturalLogarithm(scanner);
                        break;
                    case 11:
                        performLogarithmBase10(scanner);
                        break;
                    case 12:
                        performAbsoluteValue(scanner);
                        break;
                    case 13:
                        performRoundNumber(scanner);
                        break;
                    case 14:
                        performCeilingNumber(scanner);
                        break;
                    case 15:
                        performFloorNumber(scanner);
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
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm Base 10 (log)");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round Number");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
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

    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }

    public static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a non-negative number: ");
        try {
            double num = scanner.nextDouble();
            if (num < 0) {
                System.out.println("Error: Cannot calculate square root of a negative number.");
            } else {
                double result = calculateSquareRoot(num);
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // clear the invalid input
        }

    }
    public static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the exponent: ");
            double exponent = scanner.nextDouble();

            double result = calculatePower(base, exponent);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            scanner.nextLine(); // clear the invalid input
        }
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            double result = calculateSine(degrees);
            System.out.println("sin(" + degrees + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    public static double calculateSine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            double result = calculateCosine(degrees);
            System.out.println("cos(" + degrees + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // clear invalid input
        }
    }

    public static double calculateCosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    public static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            Double result = calculateTangent(degrees);

            if (result == null) {
                System.out.println("Tangent is undefined at " + degrees + " degrees.");
            } else {
                System.out.println("tan(" + degrees + ") = " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Clear invalid input
        }
    }


    public static Double calculateTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        double cosine = Math.cos(radians);

        if (Math.abs(cosine) < 1e-10) {
            // Tangent is undefined when cosine is zero
            return null;
        }

        return Math.tan(radians);
    }
    public static void performNaturalLogarithm(Scanner scanner) {
        try {
            System.out.print("Enter a positive number: ");
            double num = scanner.nextDouble();

            Double result = calculateNaturalLogarithm(num);

            if (result == null) {
                System.out.println("Error: Natural logarithm is undefined for zero or negative numbers.");
            } else {
                System.out.printf("ln(%.4f) = %.4f\n", num, result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    public static Double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            return null; // ln is undefined for 0 or negative numbers
        }
        return Math.log(num); // Natural log (base e)
    }
    public static void performLogarithmBase10(Scanner scanner) {
        try {
            System.out.print("Enter a positive number: ");
            double num = scanner.nextDouble();

            Double result = calculateLogarithmBase10(num);

            if (result == null) {
                System.out.println("Error: Logarithm base 10 is undefined for zero or negative numbers.");
            } else {
                System.out.printf("log10(%.4f) = %.4f\n", num, result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    public static Double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            return null; // log10 is undefined for zero or negative numbers
        }
        return Math.log10(num); // Base-10 logarithm
    }

    public static void performAbsoluteValue(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();

            double result = calculateAbsoluteValue(num);
            System.out.printf("Absolute value of %.4f = %.4f\n", num, result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine(); // Clear invalid input
        }
    }
    public static double calculateAbsoluteValue(double num) {
        return Math.abs(num);
    }
    public static void performRoundNumber(Scanner scanner) {
        try {
            System.out.print("Enter a number to round: ");
            double num = scanner.nextDouble();

            long result = roundNumber(num);
            System.out.println("Rounded value: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        }
    }

    public static void performCeilingNumber(Scanner scanner) {
        try {
            System.out.print("Enter a number to find the ceiling: ");
            double num = scanner.nextDouble();

            double result = ceilingNumber(num);
            System.out.println("Ceiling value: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        }
    }

    public static void performFloorNumber(Scanner scanner) {
        try {
            System.out.print("Enter a number to find the floor: ");
            double num = scanner.nextDouble();

            double result = floorNumber(num);
            System.out.println("Floor value: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        }
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }





}
