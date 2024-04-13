import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommonTerminalOps {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // forEach: Print each element of the stream
        System.out.println("forEach:");
        numbers.stream().forEach(System.out::println);

        // collect: Collect elements of the stream into a collection
        System.out.println("\ncollect:");
        List<Integer> collectedList = numbers.stream().collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);

        // reduce: Combine elements of the stream into a single result
        System.out.println("\nreduce:");
        Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);
        System.out.println("Sum of elements: " + sum.orElse(0));

        // count: Count the number of elements in the stream
        System.out.println("\ncount:");
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // min: Find the minimum element in the stream
        System.out.println("\nmin:");
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Minimum element: " + min.orElse(null));

        // max: Find the maximum element in the stream
        System.out.println("\nmax:");
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("Maximum element: " + max.orElse(null));

        // anyMatch: Check if any element in the stream matches a predicate
        System.out.println("\nanyMatch:");
        boolean anyMatch = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any even number present: " + anyMatch);
    }
}
