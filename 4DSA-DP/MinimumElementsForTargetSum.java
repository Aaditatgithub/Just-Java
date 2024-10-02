import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.Collections;

public class MinimumElementsForTargetSum {
    
    static int findMinimumElementsTab(int[] numbers, int target) {
        // Initialize the dp array with a large value (infinity) for all positions except dp[0]
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(target + 1, Integer.MAX_VALUE));
        dp.set(0, 0);  // Base case: 0 elements are needed to form the sum 0
        
        // Iterate over each target from 1 to the desired target
        for (int i = 1; i <= target; i++) {
            // Iterate over each number in the numbers array
            for (int j = 0; j < numbers.length; j++) {
                if (i >= numbers[j] && dp.get(i - numbers[j]) != Integer.MAX_VALUE) {
                    dp.set(i, Math.min(dp.get(i), dp.get(i - numbers[j]) + 1));
                }
            }
        }
        
        // If the target can't be formed by any combination of the numbers, return -1
        return dp.get(target) == Integer.MAX_VALUE ? -1 : dp.get(target);
    }

    static int findMinimumElementsMemo(int[] numbers, int target, int[] memo){
        //base case
        if(target == 0) return 0;
        if(target < 0) return Integer.MAX_VALUE;

        // memo case
        if(memo[target] != 0){
            return memo[target];
        }

        //recursive case
        int minEles = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            int remainingTarget = target - numbers[i];
            int mini = findMinimumElements(numbers, remainingTarget);

            if(mini != Integer.MAX_VALUE){
                minEles = Math.min(mini + 1, minEles);
            }
        }

        memo[target] = minEles;
        return minEles;
    }

    static int findMinimumElements(int[] numbers, int target) {
        //base case
        if(target == 0){
            return 0;
        }

        if(target < 0)
            return Integer.MAX_VALUE;

        //recursive case
        int minEles = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            int remainingTarget = target - numbers[i];
            int mini = findMinimumElements(numbers, remainingTarget);

            if(mini != Integer.MAX_VALUE){
                minEles = Math.min(mini + 1, minEles);
            }
        }

        return minEles;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int target = 22;
        int[] memo = new int[target + 1];
        Arrays.fill(memo, 0);

        System.out.println(findMinimumElementsMemo(numbers, target, memo));
    }
}