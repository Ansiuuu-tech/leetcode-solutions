class Solution {
     ArrayList<List<Integer>> result=new ArrayList<>();
     ArrayList<Integer> subset =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return result;
    }
    public void dfs(int idx,int[] nums){
        if(idx==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[idx]);
        dfs(idx+1,nums);
        subset.remove(subset.size()-1);

        dfs(idx+1,nums);
    }
}