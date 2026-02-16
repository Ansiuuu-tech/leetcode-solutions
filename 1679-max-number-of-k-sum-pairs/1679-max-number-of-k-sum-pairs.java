class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int c=0,sum;
       while(l<r)
       {
        sum=nums[l]+nums[r];
        if(sum>k)
        r--;
        else if(sum<k)
        l++;
        else{
        c++;
        l++;
        r--;}
       }
       return c;
    }
}