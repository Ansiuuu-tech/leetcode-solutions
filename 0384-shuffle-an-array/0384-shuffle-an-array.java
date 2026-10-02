class Solution {
    int nums[];
    public Random rand;
    public Solution(int[] nums) {
        this.nums=nums;
        rand=new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
                if(nums == null) return null;
        int[] a = nums.clone();
        for(int j = 1; j < a.length; j++) {
            int i = rand.nextInt(j + 1);
            swap(a, i, j);
        }
        return a;
    }
     public  void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */