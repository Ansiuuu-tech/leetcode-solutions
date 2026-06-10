class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long ans[]=new long[nums.length];
        HashMap<Integer,Long> c=new HashMap<>();
        HashMap<Integer,Long> s=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            long c1=c.getOrDefault(nums[i],0L);
            long s1=s.getOrDefault(nums[i],0L);
            ans[i]+=c1*i-s1;
            c.put(nums[i],c1+1);
            s.put(nums[i],s1+i);
                    }
                    s.clear();
                    c.clear();
        for(int i=n-1;i>=0;i--)
        {
            long c1=c.getOrDefault(nums[i],0L);
            long s1=s.getOrDefault(nums[i],0L);
            ans[i]+=s1-c1*i;
            c.put(nums[i],c1+1);
            s.put(nums[i],s1+i);
                    }
       return ans;

    }
}