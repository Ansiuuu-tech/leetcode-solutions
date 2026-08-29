class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
        
    void backtrack(int[] candidates ,int target ,int idx,List<Integer> current,List<List<Integer>> ans){
               if(target==0){
                ans.add(new ArrayList<>(current));
                    return;
               }
                if(target<0||idx==candidates.length){
                         return; 
                        }
                 current.add(candidates[idx]);
                 backtrack(candidates, target - candidates[idx],idx,current,ans);
                current.remove(current.size()-1);
                 backtrack(candidates,target,idx+1,current,ans);
     }
    
}