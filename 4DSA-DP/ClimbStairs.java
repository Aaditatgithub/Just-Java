import java.util.Arrays;

public class ClimbStairs{
    
    public static int climbStairs(int n, int[] memo) {
        // Base case
        if(n <= 1) 
            return n;

        //memoization
        if(memo[n] != 0)
            return memo[n];

        // recursive case
        return (climbStairs(n -1, memo) + climbStairs(n -2, memo));
    }
    
    public static void main(String[] args) {
        int n = 10;

        int[] memo = new int[n+1];
        Arrays.fill(memo,0);

        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n, memo));
    }
}