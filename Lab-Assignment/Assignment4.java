public class Assignment4 {
    public static void main(String[] args) {
        // Scenario 1: Divide by Zero Exception
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // Attempting to divide by zero
            System.out.println("Result of division: " + result); // This line won't be reached
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by zero exception occurred.");
        }

        // Scenario 2: Array Index Out of Bounds Exception
        try {
            int[] arr = {1, 2, 3};
            int index = 5; // Attempting to access an index that is out of bounds
            int element = arr[index];
            System.out.println("Element at index " + index + ": " + element); // This line won't be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds exception occurred.");
        }

        // Scenario 3: Null Pointer Exception
        try {
            String str = null;
            int length = str.length(); // Attempting to access a method on a null reference
            System.out.println("Length of string: " + length); // This line won't be reached
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception occurred.");
        }
    }
}
