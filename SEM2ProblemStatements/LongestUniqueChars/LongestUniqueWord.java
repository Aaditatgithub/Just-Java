package LongestUniqueChars;
import java.util.HashSet;

public class LongestUniqueWord {
    
    public static int longestSubstringLength(String text){
        int n = text.length();
        int maxLen = 0;
        int start = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        for(int i = 0; i < n; i++){
            char ch = text.charAt(i);
            if(uniqueChars.contains(ch)){
                while(start < i && text.charAt(start) != ch){
                    uniqueChars.remove(text.charAt(start));
                    start++;
                }
                start++;

            }else{
                maxLen = Math.max(maxLen, i - start + 1);
            }
            uniqueChars.add(ch);
        }
        return maxLen;
    }
    public static void main(String[] args){
        System.out.println(longestSubstringLength(";klsjavnkqjrvkqjb"));
    }
}
