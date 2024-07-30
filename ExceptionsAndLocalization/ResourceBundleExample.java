import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // The ResourceBundle class is used to store locale-specific objects.
        // It provides a way to load resources for a specific locale.

        // Create Locale for the United States
        Locale localeUS = Locale.US;

        // Create Locale for France
        Locale localeFR = Locale.FRANCE;

        // Load the ResourceBundle for the US locale
        ResourceBundle bundleUS = ResourceBundle.getBundle("MessagesBundle", localeUS);

        // Load the ResourceBundle for the France locale
        ResourceBundle bundleFR = ResourceBundle.getBundle("MessagesBundle", localeFR);

        // Retrieve and print messages from the ResourceBundle for the US locale
        System.out.println("US Greeting: " + bundleUS.getString("greeting"));
        System.out.println("US Farewell: " + bundleUS.getString("farewell"));

        // Retrieve and print messages from the ResourceBundle for the France locale
        System.out.println("France Greeting: " + bundleFR.getString("greeting"));
        System.out.println("France Farewell: " + bundleFR.getString("farewell"));
    }
}
