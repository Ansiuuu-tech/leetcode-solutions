class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int sum=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1){
            sum+=1;
            max=Math.max(max,sum);
            }
            else
            sum=0;
            
        }
        return  max;
    }
}