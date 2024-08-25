class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows*cols -1;

        int mid = start + (end - start)/2;

        while(start <= end){
            if(target < matrix[mid/cols][mid%cols]){
                end = mid - 1;
            }
            else if(target > matrix[mid/cols][mid%cols]){
                start = mid + 1;
            }
            else{
                return true;
            }
            mid = start + (end - start)/2;
        }
        return false;
    }
}