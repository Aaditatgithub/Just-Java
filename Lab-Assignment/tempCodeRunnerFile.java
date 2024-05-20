import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        // ArrayList operations
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list1.add(i);
        }
        
        System.out.println("All the elements in the list: " + list1);

        // Adding item to ArrayList after removing an item and setting an item
        list1.remove(2); // Removing item at index 2
        System.out.println("After removing item at index 2: " + list1);

        list1.add(2, 10); // Adding item '10' at index 2
        System.out.println("After adding '10' at index 2: " + list1);

        list1.set(1, 6); // Setting item at index 1 to '6'
        System.out.println("After setting item at index 1 to '6': " + list1);

        // Iterating through ArrayList
        System.out.println("Iterating through ArrayList:");
        for (Integer integer : list1) {
            System.out.println(integer);
        }

        // HashMap operations
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        System.out.println(map);

        // Removing an item from HashMap and adding a new item
        map.remove("a"); // Removing item with key "a"
        System.out.println("After removing item with key 'a': " + map);

        map.put("e", 500); // Adding item with key "e" and value '500'
        System.out.println("After adding item with key 'e' and value '500': " + map);

        // Checking if HashMap contains a specific value
        System.out.println("Does the map contain value '200'? " + map.containsValue(200));

        // Getting the hash code of the HashMap
        int hash = map.hashCode();
        System.out.println("Hash code of the map: " + hash);

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector: " + vector);

        vector.remove(1); // Removing item at index 1
        System.out.println("After removing item at index 1: " + vector);

        vector.add(1, "Mango"); // Adding item 'Mango' at index 1
        System.out.println("After adding 'Mango' at index 1: " + vector);

        vector.set(0, "Grapes"); // Setting item at index 0 to 'Grapes'
        System.out.println("After setting item at index 0 to 'Grapes': " + vector);

        System.out.println(vector.capacity());

        // Iterating through Vector
        System.out.println("Iterating through Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Set operations
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Set: " + set);

        set.remove(20); // Removing item '20'
        System.out.println("After removing item '20': " + set);

        set.add(40); // Adding item '40'
        System.out.println("After adding item '40': " + set);

        // Iterating through Set
        System.out.println("Iterating through Set:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
