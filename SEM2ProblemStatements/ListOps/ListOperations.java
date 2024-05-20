import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(21);
        System.out.println(numbers);

        numbers.add(1,124);
        System.out.println(numbers);
        numbers.add(12);

        // numbers.removeIf(num -> num == 12);
        // System.out.println(numbers);

        // numbers.remove(0);
        // System.out.println(numbers);

        // System.out.println(numbers);

        System.out.println(numbers.contains(24));

        Collections.sort(numbers);

        Collections.reverse(numbers);
        

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        list1.addAll(Arrays.asList(1,2,3,5,6,7,1));
        list2.addAll(Arrays.asList(1,2,3,5,6,7));
        list1.remove(1);
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();

        while(itr1.hasNext() && itr2.hasNext()){
            if(itr1.next() == itr2.next()){
                continue;
            }
            else{
                System.out.println("Arrays are not equal.");
                break;
            }
        }

        System.out.println(list1.indexOf(1));
        System.out.println(list1.lastIndexOf(1));


        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        int[] array = new int[size];
        Random rand = new Random();
        for(int i = 0 ; i < size; i ++){
            array[i] = rand.nextInt(-500,500);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("");
        rotateArray(array,3);

        for (int i : array) {
            System.out.print(i + " ");
        }

        int[] orderDekho = new int[]{1,1,2,1,1,1,2,2,2,2,4,4,4};
        Set<Integer> sirfNumbers = new TreeSet<>();
        for (Integer integer : orderDekho) {
            sirfNumbers.add(integer);
        }
        int[] uniqueArray = new int[sirfNumbers.size()];
        int index = 0;
        for (Integer integer : sirfNumbers) {
            uniqueArray[index++] = integer;
        }

        System.out.println("");
        for (int i : uniqueArray) {
            System.out.print(i + " ");
        }


        //EVEN AND ODDS SEPERATE
        
    }  

    static void rotateArray(int[] array, int steps){
        int actualSteps = steps % array.length;

        reverse(array, 0, array.length - 1);
        reverse(array, 0, actualSteps -1);
        reverse(array,actualSteps, array.length - 1);
    }

    static void reverse(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
