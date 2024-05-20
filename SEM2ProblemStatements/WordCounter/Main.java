
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

class WordCounter{
    static Map<String, Integer> countWords(String text){
        Map<String, Integer> countMap = new HashMap<>();
        
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            countMap.put(word, countMap.getOrDefault(word,0) + 1);
        }

        return countMap;
    }
}


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> counMap = WordCounter.countWords("The very thought of god occured to you only bacause you saw the creations isn't it?");
        System.out.println(counMap);
        
    }
}
