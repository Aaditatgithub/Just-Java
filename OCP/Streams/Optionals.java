import java.util.List;
import java.util.Optional;

public class Optionals {
    // Method to calculate the average of numbers in a list
    public static Optional<Double> calculateAverage(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty(); // Return an empty optional if the list is null or empty
        }
        
        // Calculate the sum of numbers
        double sum = 0;
        for (Double num : numbers) {
            sum += num;
        }
        
        // Calculate the average and return it wrapped in an optional
        return Optional.of(sum / numbers.size());
    }

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        
        // Calculate the average and handle the result with optional
        Optional<Double> averageOptional = calculateAverage(numbers);
        
        // Check if the optional contains a value and print the result
        averageOptional.ifPresentOrElse(
            average -> System.out.println("The average is: " + average),
            () -> System.out.println("Unable to calculate average: List is null or empty")
        );
    }
}
