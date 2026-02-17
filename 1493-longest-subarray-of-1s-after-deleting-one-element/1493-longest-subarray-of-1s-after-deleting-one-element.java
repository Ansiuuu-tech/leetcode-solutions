class Solution {
    public int longestSubarray(int[] nums) {
         int left=0,right=0;
        int c=0;
        int len=0,maxlen=0;
       while(right<nums.length)
       {
        
        if(nums[right]==0)
        {
            
            c++;
        }
        while(c>1){
       if(nums[left]==0)
       {
        c--;
       
       }
       left++;

        }
        maxlen=Math.max(maxlen,right-left+1);
       
     right++;
    
       }
       return (maxlen-1);
    }
}