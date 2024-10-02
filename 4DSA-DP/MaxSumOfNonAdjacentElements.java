public class MaxSumOfNonAdjacentElements {
    
    static int findMaxSumSpaceOptim(int[] numbers, int n){
       if(n == 0) return 0;
       if(n == 1) return numbers[0];

       int prev2 = numbers[0];
       int prev1 = Math.max(prev2, numbers[1]);

       for(int i = 2; i < numbers.length; i++){
            int current = Math.max(prev2 + numbers[i], prev1);
            prev2 = prev1;
            prev1 = current;
       }

       return prev1;
    }

    static int findMaxSumMemo(int[] numbers, int n){
        if(n < 0)   return 0;
        if(n == 0) return numbers[0];     

        int[] dp = new int[n]
 
        int incl = findMaxSum(numbers, n - 2) + numbers[n];
        int excl = findMaxSum(numbers, n - 1) + 0; 
 
        return max(incl,excl);
     }

    public static void main(String[] args) {
        int[] numbers = {9,9,3,6,2,6,5,2,5,73,7,43,2,6,7,93,6};
        int n = numbers.length;
    }
}
