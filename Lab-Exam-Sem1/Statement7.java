import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class WordCounter {
    public int countUniqueWords(String text) {
        // Remove punctuation and extra spaces
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");
        
        // Create a HashSet to store unique words
        Set<String> uniqueWords = new HashSet<>();
        
        // Add each word to the HashSet
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        // Return the size of the HashSet, which represents the count of unique words
        return uniqueWords.size();
    }
}

public class Statement7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        scanner.close();
        
        WordCounter wordCounter = new WordCounter();
        int uniqueWordCount = wordCounter.countUniqueWords(text);
        
        System.out.println("Number of unique words: " + uniqueWordCount);
    }
}
