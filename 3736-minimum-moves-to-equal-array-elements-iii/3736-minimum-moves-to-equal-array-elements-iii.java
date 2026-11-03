class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            diff += (nums[nums.length - 1] - nums[i]);
        }
        return diff;
    }
}