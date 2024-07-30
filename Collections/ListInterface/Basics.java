
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Basics{
    public static void main(String[] args) {
        String[] arr = new String[] {"a","b","c"};

        List<String> asList = Arrays.asList(arr);   //fixed size list returned, only replacing allowed
        List<String> listOf = List.of(arr);         // immutable list
        List<String> copyOf = List.copyOf(asList);  //input is collection; immutable copy
        

        System.out.println(asList);
        System.out.println(listOf);
        System.out.println(copyOf);

        LinkedList<Integer> linked1 = new LinkedList<>();
        LinkedList<Integer> linked2 = new LinkedList<>(linked1);    // copy constructor

        // //Not allowed idk why, compiler throwing err
        // LinkedList<Integer> linked3 = new LinkedList<>(4);         //slots in list

        linked1.add(12);
        linked1.add(22);
        linked1.add(42);
        linked1.add(52);
        linked1.add(32);
        linked1.add(2);
        linked1.add(72);

        linked1.add(1,55);
        linked1.get(4);     

        linked1.remove(6);
        //overloaded remove method
        linked1.remove(Integer.valueOf(2));

        //Unaryoperator Interface input 
        linked1.replaceAll((num) -> {return num*2;});
        
        //replaces at index with element given
        linked1.set(2,24);

        String[] a = asList.toArray(new String[0]);
        for(String i: a){
            System.out.println(i);
        }

    }                
}