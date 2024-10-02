public class Fibonacci {
    
    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method to test the recursive Fibonacci method
    public static void main(String[] args) {
        int n = 10; // Example: Calculate the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
