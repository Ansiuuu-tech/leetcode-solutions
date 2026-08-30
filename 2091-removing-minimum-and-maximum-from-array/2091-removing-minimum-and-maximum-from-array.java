class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
       
        int maxidx=0,minidx=0,max=nums[0],min=nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max){
            maxidx=i;
            max=Math.max(max,nums[i]);
            }
            if(nums[i]<min)
            {
                minidx=i;
                min=Math.min(min,nums[i]);
            }
        }

        int ans1,ans2,ans3;
         ans1=Math.max(maxidx,minidx)+1;
         ans2=n-Math.min(maxidx,minidx);
         if(maxidx<minidx)
         ans3=maxidx+(n-minidx)+1;
         else
         ans3=minidx+(n-maxidx)+1;

         return Math.min(ans1,Math.min(ans2,ans3));
    }
}