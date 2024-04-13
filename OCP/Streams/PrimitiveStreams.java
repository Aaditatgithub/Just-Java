import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        // Example 1: IntStream
        int[] numbers = {1, 2, 3, 4, 5};

        // Using IntStream to perform operations on primitive integers
        IntStream intStream = Arrays.stream(numbers);

        // Calculating sum
        int sum = intStream.sum();
        System.out.println("Sum: " + sum);

        // Example 2: IntStream range
        // Generating a range of integers from 1 to 5 (inclusive)
        IntStream rangeStream = IntStream.range(1, 6);
        rangeStream.forEach(System.out::println);

        // Example 3: IntStream statistics
        IntStream statsStream = Arrays.stream(numbers);

        // Calculating statistics such as count, sum, min, max, and average
        IntSummaryStatistics stats = statsStream.summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}
