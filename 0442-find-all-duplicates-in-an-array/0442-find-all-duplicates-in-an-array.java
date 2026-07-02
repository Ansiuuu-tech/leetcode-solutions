class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<=n;i++)
        {
            if(arr[i]>1)
            ls.add(i);
        }
        return ls;
    }
}