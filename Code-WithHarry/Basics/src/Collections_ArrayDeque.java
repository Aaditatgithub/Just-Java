import java.util.ArrayDeque;
import java.util.Deque;

public class Collections_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(123);
        deque.addFirst(65);
        deque.addFirst(83);

        for(Integer i : deque){
            System.out.println(i + " ");
        }
    }
}
