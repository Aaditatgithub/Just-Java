// A simple lambda expression that takes two integers and returns their sum.
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression.
        Sum sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20)); // Output: Sum: 30
    }
}
