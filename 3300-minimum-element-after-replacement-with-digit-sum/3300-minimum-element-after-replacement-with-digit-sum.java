class Solution {
    public int minElement(int[] nums) {
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {   
            int t=nums[i];
            int sum=0;
            while(t>0){
                int rem=t%10;
                sum=sum+rem;
                t/=10;
            }
            minsum=Math.min(minsum,sum);
        }
        return minsum;
    }
}