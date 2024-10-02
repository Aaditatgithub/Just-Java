public class ClimbStairs {

    // Recursive method to calculate the number of ways to climb the stairs
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;  // Base case: 1 way to climb 0 or 1 step
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    // Main method to test the recursive climbStairs method
    public static void main(String[] args) {
        int n = 5; // Example: Calculate the number of ways to climb 5 stairs
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
}
