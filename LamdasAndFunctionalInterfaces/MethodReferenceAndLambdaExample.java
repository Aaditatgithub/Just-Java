import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceAndLambdaExample {

    public static void main(String[] args) {
        // Case 1: Method reference to a static method
        Function<String, Integer> parseIntFunc = Integer::parseInt;
        int parsedInt = parseIntFunc.apply("123");
        System.out.println("Parsed integer: " + parsedInt);

        // Case 2: Method reference to an instance method of an existing object
        String prefix = "Prefix: ";
        Function<String, String> addPrefixFunc = prefix::concat;
        String result = addPrefixFunc.apply("Suffix");
        System.out.println("Result after adding prefix: " + result);

        // Case 3: Method reference to an instance method of an arbitrary object of a particular type
        List<String> strings = new ArrayList<>();
        Consumer<String> addStringConsumer = strings::add;
        addStringConsumer.accept("Hello");
        addStringConsumer.accept("World");
        System.out.println("Strings added to list: " + strings);

        // Case 4: Constructor reference
        Supplier<String> newStringSupplier = String::new;
        String newString = newStringSupplier.get();
        System.out.println("New string created: " + newString);

        // Case 5: Lambda expression as a Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Case 6: Lambda expression as a Function
        Function<Integer, Integer> squareFunc = num -> num * num;
        int squaredNum = squareFunc.apply(5);
        System.out.println("Square of 5: " + squaredNum);
    }
}
