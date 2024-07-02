import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrences of each word using a HashMap
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // allows changing values for a given key or create them
            wordCountMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue++);
        }
        // Display the word count map
        System.out.println(wordCountMap);
    }
}
