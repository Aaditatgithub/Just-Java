class MutableInteger {
    public int value;

    public MutableInteger(int value) {
        this.value = value;
    }
}

public class CallByValueReference {
    public static void main(String[] args) {
        MutableInteger number = new MutableInteger(10);

        System.out.println("Modified value inside the method: " + number.value);

        // Call the method with a MutableInteger parameter
        modifyValue(number);

        // Print the original value to see if it has changed
        System.out.println("Original value outside the method: " + number.value);
    }

    public static void modifyValue(MutableInteger value) {
        // Modify the value inside the method
        value.value = 20;
    }
}
