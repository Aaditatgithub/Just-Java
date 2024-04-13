import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOps {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // map: Double each element of the stream
        List<Integer> doubledNumbers = numbers.stream()
                                              .map(n -> n * 2)
                                              .collect(Collectors.toList());
        System.out.println("Doubled numbers: " + doubledNumbers);

        // filter: Keep only even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // distinct: Remove duplicate elements
        List<Integer> distinctNumbers = numbers.stream()
                                               .map(n -> n % 3)  // Introducing duplicates for demonstration
                                               .distinct()
                                               .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);

        // sorted: Sort elements in natural order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        // limit: Limit the number of elements in the stream
        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(5)
                                              .collect(Collectors.toList());
        System.out.println("Limited numbers: " + limitedNumbers);

        // skip: Skip the first n elements of the stream
        List<Integer> skippedNumbers = numbers.stream()
                                              .skip(5)
                                              .collect(Collectors.toList());
        System.out.println("Skipped numbers: " + skippedNumbers);

         // Nested list of strings
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana", "cherry"),
                Arrays.asList("orange", "grape", "pear"),
                Arrays.asList("pineapple", "mango", "kiwi")
        );

        // Using flatMap to flatten the nested list into a single list of strings
        List<String> flattenedList = nestedList.stream()
                                               .flatMap(List::stream) // Flatten the nested lists
                                               .collect(Collectors.toList());

        // Print the flattened list
        System.out.println("Flattened List: " + flattenedList);
    }
}
