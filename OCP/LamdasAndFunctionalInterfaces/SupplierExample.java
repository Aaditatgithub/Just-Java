import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Example 1: Creating a supplier for a random number
        Supplier<Double> randomSupplier = Math::random;
        double randomValue = randomSupplier.get();
        System.out.println("Random value: " + randomValue);

        // Example 2: Creating a supplier for a constant value
        Supplier<String> constantSupplier = () -> "Hello, World!";
        String constantValue = constantSupplier.get();
        System.out.println("Constant value: " + constantValue);
    }
}
