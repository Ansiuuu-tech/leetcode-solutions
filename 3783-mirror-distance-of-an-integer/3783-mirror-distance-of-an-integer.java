class Solution {
    public int mirrorDistance(int n) {
        int t=n;
        int rev=0;
        while(t>0)
        {
            int r=t%10;
            rev=rev*10+r;
            t/=10;
        }
        return(Math.abs(rev-n));
    }
}