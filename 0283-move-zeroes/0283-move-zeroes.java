class Solution {
    public void moveZeroes(int[] nums) {
        int right=0,left=0;
       while(right<nums.length)
       {
        if(nums[right]!=0)
        {
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
        }
        right++;
       }
    
    System.out.println( nums);
}
}