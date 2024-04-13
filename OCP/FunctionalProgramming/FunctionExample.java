import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionExample {
    public static void main(String[] args) {
        // Function example: Convert String to its length
        Function<String, Integer> strLength = str -> str.length();
        System.out.println("Length of 'hello': " + strLength.apply("hello"));

        // BiFunction example: Combine two strings with a separator
        BiFunction<String, String, String> combineStrings = (str1, str2) -> str1 + "-" + str2;
        System.out.println("Combined string: " + combineStrings.apply("hello", "world"));
    }
}
