class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0,sum=0,rs=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        } 
        for(int i=0;i<nums.length;i++)
        {
            rs=sum-ls-nums[i];
            if(ls==rs)
            return i;
               ls+=nums[i];
            
        }
        return -1;
        
    }
}