import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> quest = new LinkedList<>();
        quest.addFirst(12);
        quest.addLast(124);
        quest.peekFirst();
        quest.peekLast();

        quest.removeFirst();
        quest.removeLast();

        // //Deque as stack
        // quest.pop();
        // quest.push(98);

    }   
}
