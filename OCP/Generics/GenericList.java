import java.util.Arrays;

public class GenericList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] items; // Use Object array and cast items to T
    private int count;

    // Constructor
    public GenericList() {
        items = new Object[INITIAL_CAPACITY];
        count = 0;
    }

    // Method to add an item to the list
    public void addItem(T item) {
        // Resize the array if needed
        if (count == items.length) {
            resize();
        }
        items[count++] = item;
    }

    // Method to retrieve an item by index
    public T getItem(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return (T) items[index];
    }

    // Method to resize the internal array
    private void resize() {
        int newSize = items.length * 2;
        items = Arrays.copyOf(items, newSize);
    }

    // Method to get the number of items in the list
    public int size() {
        return count;
    }

    // Method to print all items (for demonstration purposes)
    public void printItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    // Upper bound: T must be a subclass of Number
    // public <T extends Number> void printNumber(T number) {
    //     System.out.println(number);
    // }

    public static void main(String[] args) {
        GenericList<Integer> genList = new GenericList<>();

        // Adding items to the list
        genList.addItem(1);
        genList.addItem(2);
        genList.addItem(3);

        // Printing items
        genList.printItems();

        // Retrieving and printing an item by index
        System.out.println("Item at index 1: " + genList.getItem(1));

        // Handling index out of bounds
        try {
            System.out.println("Item at index 5: " + genList.getItem(5));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
