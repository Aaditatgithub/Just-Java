import java.util.ArrayList;
import java.util.Iterator;

public class IterateList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        
        // Iterate using Iterator
        System.out.print("Iterator Loop: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // Iterate using advanced for-loop (foreach loop)
        System.out.print("Advanced For Loop: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Iterate using simple for-loop
        System.out.print("For Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
