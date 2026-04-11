class Solution {
    public int minimumDistance(int[] nums) {
      HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for(ArrayList<Integer> l:map.values())
        {
            if(l.size()>=3){
                for(int i=0;i<=l.size()-3;i++)
                {
                    int f=l.get(i);
                    int t=l.get(i + 2);

                    int dis=2*(t-f);
                    ans=Math.min(ans,dis);
                }
            }
        }

        if (ans==Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}