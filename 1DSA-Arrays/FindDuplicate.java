class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int currNum : nums) {
            int eleIndex = Math.abs(currNum) - 1;
            if (nums[eleIndex] < 0) {
                duplicates.add(Math.abs(currNum));
            } else {
                nums[eleIndex] *= -1;
            }
        }
        return duplicates;
    }
}