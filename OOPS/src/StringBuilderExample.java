public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder creation
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append
        stringBuilder.append(" World!");

        // Insert
        stringBuilder.insert(5, " Java");

        // Print StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);

        // Reverse
        stringBuilder.reverse();
        System.out.println("Reversed StringBuilder: " + stringBuilder);

        // Delete
        stringBuilder.delete(5, 10);
        System.out.println("StringBuilder after deletion: " + stringBuilder);

        // Length
        int length = stringBuilder.length();
        System.out.println("Length of StringBuilder: " + length);

        // Capacity
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity of StringBuilder: " + capacity);
    }
}