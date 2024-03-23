public class StringBufferExample {
    public static void main(String[] args) {
        // StringBuffer creation
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append
        stringBuffer.append(" World!");

        // Insert
        stringBuffer.insert(5, " Java");

        // Print StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Reverse
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // Delete
        stringBuffer.delete(5, 10);
        System.out.println("StringBuffer after deletion: " + stringBuffer);

        // Length
        int length = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + length);

        // Capacity
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);
    }
}