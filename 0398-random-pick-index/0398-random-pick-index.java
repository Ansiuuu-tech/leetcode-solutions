class Solution {

    public Map<Integer,List<Integer>> map;
    public Random random;
    public Solution(int[] nums) {
        map=new HashMap<>();
        random = new Random();
    
        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
    }
    
    public int pick(int target) {
         List<Integer> idx= map.get(target);
        return idx.get(random.nextInt(idx.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */