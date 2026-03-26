class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
int maxs=0,sum=0;
int l=0,r=nums.length-1;
while(l<r)
{
  sum=nums[l]+nums[r];
  maxs=Math.max(sum,maxs);
  l++;
  r--;
}
return maxs;

    }
}