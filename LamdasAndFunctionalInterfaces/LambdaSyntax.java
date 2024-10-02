@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

public class LambdaSyntax {
    public static void main(String[] args) {
        // Single statement lambda
        Operation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3)); // Output: Addition: 8

        // Multi-statement lambda with a return statement
        Operation subtraction = (a, b) -> {
            int result = a - b;
            return result;
        };
        System.out.println("Subtraction: " + subtraction.operate(10, 4)); // Output: Subtraction: 6
    }
}
