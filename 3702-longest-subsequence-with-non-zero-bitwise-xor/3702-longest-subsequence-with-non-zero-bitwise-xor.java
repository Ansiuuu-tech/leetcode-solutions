class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean nzero=false;
        for(int i=0;i<nums.length;i++)
        {
                xor^=nums[i];
              if(nums[i]!=0)
              nzero=true;

        }
        if(xor!=0)
        return nums.length;
       if(nzero)
       return nums.length-1;
        return 0;

    }
}