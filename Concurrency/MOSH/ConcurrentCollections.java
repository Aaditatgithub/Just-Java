import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"aa");
        map.get(1);
        map.remove(1);  

    }
}
