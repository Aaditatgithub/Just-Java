import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(12);
        q.add(12);
        q.add(12);
        System.out.println(q.remove());
        
        //read from front 
        q.peek();

    }
}