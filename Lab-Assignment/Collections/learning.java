import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learning   {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        
        // Displaying elements of the list using a traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        
        // Using an iterator to traverse through the list
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
        // Using forEachRemaining method to iterate over the remaining elements of the list
        System.out.println("\nUsing forEachRemaining:");
        iterator = stringList.iterator(); // Resetting the iterator
        iterator.forEachRemaining(element -> System.out.println(element));
    }
}
