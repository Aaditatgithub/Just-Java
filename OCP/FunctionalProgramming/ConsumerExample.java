import java.util.function.Consumer;
import java.util.function.BiConsumer;


//Dp something with the parameters but return nothing
public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer example
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        // BiConsumer example
        BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + ": " + value);
        printKeyValue.accept("Age", 25);
    }
}
