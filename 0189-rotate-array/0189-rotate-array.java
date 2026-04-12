class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }
    public static int[] reverse(int []arr,int st,int en)
    {
        while(st<en)
        {
            int t=arr[st];
            arr[st]=arr[en];
            arr[en]=t;
            st++;
            en--;
        }
        return arr;
    }
}