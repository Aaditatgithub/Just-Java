import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class TesterClass {

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<Integer> (set);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size  =  Integer.parseInt(sc.nextLine());
        Integer[] array = new Integer[size];

        for(int i = 0; i < size; i++){
            Integer newInt = sc.nextInt();
            array[i] = newInt;
        }

        sc.nextLine();
        sc.close();
        
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(array))));
        
    }   
}
