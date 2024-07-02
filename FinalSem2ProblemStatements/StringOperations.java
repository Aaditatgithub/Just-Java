import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read 10 strings from the console
        List<String> strings = new ArrayList<>();
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings.add(sc.nextLine());
        }

        // Sort the strings
        Collections.sort(strings);

        // Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Step 2: Combine two strings
        System.out.println("Enter first string to combine:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string to combine:");
        String str2 = sc.nextLine();

        String combinedString = str1 + str2;
        System.out.println("Combined string: " + combinedString);

        // Step 3: Reverse the first string and display it
        String reversedString = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed first string: " + reversedString);
    }
}
