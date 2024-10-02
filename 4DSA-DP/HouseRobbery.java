import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    // Helper function to calculate the maximum sum for a given ArrayList
    private static int maxSum(ArrayList<Integer> houses) {
        int n = houses.size();

        int prev2 = houses.getFirst();
        int prev1 = Math.max(prev2, houses.get(1));

        for(int i = 2; i < n; i++){
            int current = Math.max(prev1, prev2 + houses.get(i));
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public int rob(int[] nums) {
        // Convert the input array to an ArrayList
        ArrayList<Integer> houses = new ArrayList<>();
        for (int num : nums) {
            houses.add(num);
        }

        // If there's only one house, return its value
        if (nums.length == 1) return nums[0];
        // If there are two houses, return the max of the two
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        ArrayList<Integer> case1 = new ArrayList<>(houses);
        ArrayList<Integer> case2 = new ArrayList<>(houses);
        
        // Remove the first house in case1 and the last house in case2
        case1.remove(case1.size() - 1);  // Exclude last house
        case2.remove(0);  // Exclude first house

        // Calculate the maximum sum for both cases
        int robbery1 = maxSum(case1);
        int robbery2 = maxSum(case2);

        // Return the maximum of the two strategies
        return Math.max(robbery1, robbery2);
    }

}
