import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parsing
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-01-01 12:30:00", formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        // Adding 3 days and subtracting 1 month
        LocalDateTime modifiedDateTime = currentDateTime.plusDays(3).minusMonths(1);
        System.out.println("Modified Date and Time: " + modifiedDateTime);
    }
}

