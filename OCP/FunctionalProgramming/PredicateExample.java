import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // BiPredicate example
        BiPredicate<String, Integer> isValidLength = (str, length) -> str.length() == length;
        System.out.println("Is 'Java' of length 4? " + isValidLength.test("Java", 4));
    }
}
