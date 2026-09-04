class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int arr[]=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            int min=nums[i];
               for(int j=i;j<nums.length;j++)
               {
                if(nums[j]<min)
                min=nums[j];
               }
               arr[i]=max-min;
              
               
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
          
                if(arr[i]<=k)
                    return i;
           
        }
        return ans;

    }
}