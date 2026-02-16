class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0;
        int c=0;
        int len=0,maxlen=0;
       while(right<nums.length)
       {
        
        if(nums[right]==0)
        {
            
            c++;
        }
        while(c>k){
       if(nums[left]==0)
       {
        c--;
       
       }
       left++;

        }
        maxlen=Math.max(maxlen,right-left+1);
       
     right++;
    
       }
       return maxlen;
       
    }
}