class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            minSum = Math.min(minSum, sol(nums, i));
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }

    public int sol(List<Integer> nums, int size) {
        int minSum = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.size(); right++) {
            sum += nums.get(right);

            while (right - left + 1 > size) {
                sum -= nums.get(left);
                left++;
            }
            if (right >= size - 1 && sum > 0)
                minSum = Math.min(minSum, sum);

        }
        return minSum;

    }
}