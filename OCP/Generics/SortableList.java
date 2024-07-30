import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortableList<T extends Comparable<T>> {
    private T[] items;
    private int size;
    
    @SuppressWarnings("unchecked")
    public SortableList(int capacity) {
        // Initialize the array with the given capacity
        items = (T[]) new Comparable[capacity];
        size = 0;
    }

    // Add an item to the list
    public void addItem(T item) {
        if (size >= items.length) {
            resize();
        }
        items[size++] = item;
    }

    // Resize the internal array
    private void resize() {
        int newSize = items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }

    // Get an item by index
    public T getItem(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return items[index];
    }

    // Sort the items in the list
    public void sort() {
        Arrays.sort(items, 0, size);
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(items[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create a SortableList for Integer elements
        SortableList<Integer> integerList = new SortableList<>(10);
        integerList.addItem(10);
        integerList.addItem(5);
        integerList.addItem(7);

        // Print before sorting
        System.out.println("Before sorting: " + integerList);

        // Sort and print after sorting
        integerList.sort();
        System.out.println("After sorting: " + integerList);

        // Create a SortableList for String elements
        SortableList<String> stringList = new SortableList<>(10);
        stringList.addItem("Apple");
        stringList.addItem("Banana");
        stringList.addItem("Cherry");

        // Print before sorting
        System.out.println("Before sorting: " + stringList);

        // Sort and print after sorting
        stringList.sort();
        System.out.println("After sorting: " + stringList);
    }
}
