@FunctionalInterface
interface Operation {
    double apply(double a, double b);
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        // Lambda expression for addition
        Operation addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        Operation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        Operation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        Operation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };

        // Perform operations
        System.out.println("Addition: " + performOperation(5, 3, addition));
        System.out.println("Subtraction: " + performOperation(5, 3, subtraction));
        System.out.println("Multiplication: " + performOperation(5, 3, multiplication));
        System.out.println("Division: " + performOperation(5, 3, division));
    }

    // Method that takes the functional interface as a parameter and performs the operation
    public static double performOperation(double a, double b, Operation operation) {
        return operation.apply(a, b);
    }
}

