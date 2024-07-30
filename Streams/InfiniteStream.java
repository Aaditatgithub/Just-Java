import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        // Generating an infinite stream of natural numbers
        Stream<Integer> naturalNumbers = Stream.iterate(1, n -> n + 1);
        
        // Limiting the stream to the first 10 elements and printing them
        naturalNumbers.limit(10).forEach(System.out::println);
    }
}
