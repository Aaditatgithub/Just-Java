import java.util.LinkedList;

public class Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(12);
        l1.add(12);
        l1.add(12);
        l1.add(12);
        l1.addLast(654);
        l1.addFirst(345);

        for(Integer i : l1){
            System.out.println(i + " ");
        }
    }
}
