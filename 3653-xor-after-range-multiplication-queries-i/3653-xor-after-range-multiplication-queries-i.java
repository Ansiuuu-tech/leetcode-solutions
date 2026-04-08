class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int r=queries.length;
        int c=queries[0].length;
        for(int i=0;i<r;i++)
        {
         int idx=queries[i][0];
         while(idx<=queries[i][1])
         {
        
            nums[idx]=(int)((1L*nums[idx]*queries[i][3])%(1e9+7));
            idx+=queries[i][2];
         }   
        }
        int xor=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            xor^=nums[i];
        }

        return xor;


    }
}