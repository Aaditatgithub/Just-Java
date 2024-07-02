import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ConcatList {

    static List<Integer> concatLists(List<Integer> l1, List<Integer> l2){
        
        ListIterator<Integer> itr = l2.listIterator(l2.size());
        while(itr.hasPrevious()){
            l1.add(itr.previous());
        }

        return l1;
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(concatLists(l1,l2));
    }
}
