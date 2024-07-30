import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    // Method to print elements of a list with wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Method to sum numbers in a list with bounded wildcard
    public static <T extends Number> double sumList(List<T> list) {
        double sum = 0;
        for (T number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // List of integers
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // List of doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);

        // Using wildcard to print lists
        System.out.println("Integer List:");
        printList(intList);

        System.out.println("\nDouble List:");
        printList(doubleList);

        // Using bounded wildcard to sum lists
        System.out.println("\nSum of Integer List: " + sumList(intList));
        System.out.println("Sum of Double List: " + sumList(doubleList));
    }
}
