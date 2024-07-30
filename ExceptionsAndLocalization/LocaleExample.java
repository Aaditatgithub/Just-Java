import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        // The Locale class represents a specific geographical, political, or cultural region.
        // It is used to tailor the display of information such as numbers, dates, and strings.

        // Create Locale for the United States
        Locale localeUS = Locale.US;

        // Create Locale for France
        Locale localeFR = Locale.FRANCE;

        // Create Locale for Japan
        Locale localeJP = Locale.JAPAN;

        // Print the locale objects to show their country and language codes
        System.out.println("US Locale: " + localeUS);
        System.out.println("France Locale: " + localeFR);
        System.out.println("Japan Locale: " + localeJP);
    }
}
