import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Basics{
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();         // give type to both or only left side


        System.out.println(collection.add(12));             // return boolean, would return false for set
        collection.add(24);
        collection.add(411);
        collection.add(15);

        System.out.println(collection.remove(41112));

        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        //collection.clear();

        System.out.println(collection.contains(24));

        // collection.stream()
        //     .filter((Integer num) -> {return num%2 == 0;})
        //     .collect(Collectors.toList());

        //Predicate Function inside
        collection.removeIf(num -> {return num%2 == 0;});

        //Consumer, would only act on parameters, wont return anything
        collection.forEach((s) -> {System.out.println(s);});

        for(Integer i: collection){
            System.out.print(i + " ");
        }

        Iterator<Integer> iter = collection.iterator();
        while(iter.hasNext()){System.out.print(iter.next() + " ");}

        // check if two Collections are same
        // System.out.println(collection.equals(collection));

    }
}