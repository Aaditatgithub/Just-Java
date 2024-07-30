import java.util.Arrays;

public class ParallelStreams {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Using parallel stream to calculate the sum of squares
        long sum = Arrays.stream(numbers)
                         .parallel()  // Creating a parallel stream
                         .mapToLong(x -> x * x)
                         .sum();
        
        System.out.println("Sum of squares: " + sum);
    }
}
