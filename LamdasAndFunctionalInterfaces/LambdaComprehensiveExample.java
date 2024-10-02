import java.util.function.*; // Import all functional interfaces
import java.util.*;

// 1. Define Functional Interfaces and Use Simple Lambdas
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaComprehensiveExample {

    public static void main(String[] args) {
        
        // 1. Writing Simple Lambdas
        // Single statement lambda: greeting message
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice"); // Output: Hello, Alice

        // Lambda for addition operation
        MathOperation add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operate(10, 20)); // Output: Sum: 30

        // 2. Using Method References
        // 2.1. Referencing static method: parseInt method of Integer class
        Function<String, Integer> parseInt = Integer::parseInt;
        Integer number = parseInt.apply("123");
        System.out.println("Parsed Integer: " + number); // Output: Parsed Integer: 123

        // 2.2. Referencing instance method on a particular object
        String str = "Hello Lambda!";
        Supplier<String> toUpperCase = str::toUpperCase;
        System.out.println("Uppercase: " + toUpperCase.get()); // Output: Uppercase: HELLO LAMBDA!

        // 2.3. Referencing instance method on a parameter
        Function<String, Integer> stringLength = String::length;
        System.out.println("Length: " + stringLength.apply("Lambda")); // Output: Length: 6

        // 2.4. Referencing constructor
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("Item 1");
        list.add("Item 2");
        System.out.println(list); // Output: [Item 1, Item 2]

        // 3. Using Built-in Functional Interfaces
        // 3.1. Supplier example
        Supplier<Double> randomValue = Math::random;
        System.out.println("Random Value: " + randomValue.get()); // Output: Random Value: (random double)

        // 3.2. Consumer example
        Consumer<String> printer = System.out::println;
        printer.accept("Lambda in Action!"); // Output: Lambda in Action!

        // 3.3. Predicate example
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println("Is empty: " + isEmpty.test("")); // Output: Is empty: true

        // 3.4. BiPredicate example
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5: " + isGreater.test(10, 5)); // Output: Is 10 greater than 5: true

        // 3.5. Function example
        Function<String, Integer> lengthFunction = String::length;
        System.out.println("Length of 'Functional': " + lengthFunction.apply("Functional")); // Output: Length of 'Functional': 10

        // 3.6. UnaryOperator example
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5)); // Output: Square of 5: 25

        // 3.7. BinaryOperator example
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Product of 4 and 7: " + multiply.apply(4, 7)); // Output: Product of 4 and 7: 28

        // 4. Using Convenience Methods
        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> squareFunc = x -> x * x;
        Function<Integer, Integer> addOneThenSquare = addOne.andThen(squareFunc);
        System.out.println("Result of (5 + 1)^2: " + addOneThenSquare.apply(5)); // Output: Result of (5 + 1)^2: 36

        // 5. Working with Primitive Functional Interfaces
        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println("Is 6 even? " + isEven.test(6)); // Output: Is 6 even? true

        DoubleFunction<String> doubleToString = d -> "Value: " + d;
        System.out.println(doubleToString.apply(2.718)); // Output: Value: 2.718

        // 6. Working with Variables in Lambdas
        String prefix = "Value: ";
        Consumer<Integer> displayValue = val -> System.out.println(prefix + val); // 'prefix' is effectively final
        displayValue.accept(100); // Output: Value: 100

        // 7. Defining and Using Custom Functional Interfaces
        CustomFunctionalInterfaceExample();
    }

    // Custom functional interface for demonstration
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void CustomFunctionalInterfaceExample() {
        // Implementing the functional interface using a lambda expression
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        // Using the defined functional interfaces
        System.out.println("10 + 20 = " + addition.calculate(10, 20)); // Output: 10 + 20 = 30
        System.out.println("10 * 20 = " + multiplication.calculate(10, 20)); // Output: 10 * 20 = 200
    }
}
