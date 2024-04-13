import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample{
    public static void main(String[] args) {
        //Factory method for creation
        // Map.of(12,"i am 12",42,"i am 42");
        // Map.entry(12, 24);
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"bonjour");
        map.put(3,"yoroshiku");
        map.put(4,"namaste");
        System.out.println(map);

        System.out.println(map.get(2));

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("hello"));
        System.out.println(map.isEmpty());

        System.out.println(map.size());


        //Iterate ::: Expects a biconsumer functional interface
        map.forEach((k,v) -> System.out.println(k + " -> " + v));

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);

        //get() returns null if value is not present in the map
        System.out.println(map.getOrDefault(6,"nope"));

        //Replacing values by prov key
        map.replace(2, "popito");
        System.out.println(map);

        
    }
}