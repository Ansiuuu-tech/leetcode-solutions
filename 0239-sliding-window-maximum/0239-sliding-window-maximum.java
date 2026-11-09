class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;

        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        ans.add(maxi);

        for (int r = 1; r <= n - k; r++) {

            if (nums[r + k - 1] > maxi) {
                maxi = nums[r + k - 1];
                ans.add(maxi);
                continue;
            }

            if (nums[r] == maxi) {
                ans.add(maxi);
                continue;
            }

            if (nums[r - 1] == maxi) {
                maxi = Integer.MIN_VALUE;

                for (int j = 0; j < k; j++) {
                    maxi = Math.max(maxi, nums[r + j]);
                }

                ans.add(maxi);
            } else {
                ans.add(maxi);
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}