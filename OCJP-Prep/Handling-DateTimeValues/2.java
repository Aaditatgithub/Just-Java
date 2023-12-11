import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAdvancedExample {
    public static void main(String[] args) {
        // Handling Time Zones
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(zone);
        System.out.println("Current Date and Time in New York: " + zonedDateTime);

        // Temporal Adjusters
        LocalDate nextSunday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next Sunday's Date: " + nextSunday);

        // Temporal Queries
        boolean isLeapYear = Year.now().isLeap();
        System.out.println("Is the current year a leap year? " + isLeapYear);

        // Handling Duration and Period
        Duration duration = Duration.ofHours(3);
        Period period = Period.ofMonths(2);
        LocalDateTime startDateTime = LocalDateTime.of(2023, Month.JANUARY, 1, 12, 0);
        LocalDateTime endDateTime = startDateTime.plus(duration).plus(period);
        System.out.println("End Date and Time: " + endDateTime);

        // Custom Formatting Pattern
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customDate = LocalDate.parse("25/12/2023", customFormatter);
        System.out.println("Custom Formatted Date: " + customDate);

        // Handling Duration Between Dates
        Duration durationBetween = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration Between Dates: " + durationBetween.toHours() + " hours");
    }
}
