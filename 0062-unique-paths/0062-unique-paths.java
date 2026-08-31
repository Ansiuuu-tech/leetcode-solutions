class Solution {
    public int uniquePaths(int m, int n) {
        int a=m+n-2;
        int b=Math.min(m,n)-1;
        long res = combination(a,b);
        return (int)res;

    }

    long combination(int n,int r)
    {
        if(r==0)
        return 1;
        if(r==1)
        return (long)n;

        return combination(n,r-1)*(n-r+1)/r;
    }

}