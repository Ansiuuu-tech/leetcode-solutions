class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long max=piles[0];
        for(long p:piles)
        {
            max=Math.max(max,p);
        }

        long low=1;
        long high=max;
        long ans=high;
        
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(helper(piles,h,mid))
            {
                high=mid-1;
                ans=mid;
            }
            else
            low=mid+1;
        }
        return (int)ans;
    }
    public static boolean helper(int[] piles,int h,long k)
    {
        int th=0;
        for(long p: piles)
        {
            th+=(p+k-1)/k;
            if(th>h)
            return false;
        }
        return th<=h;
    }
}