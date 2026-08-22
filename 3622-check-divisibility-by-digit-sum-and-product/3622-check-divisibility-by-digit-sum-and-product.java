class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int t=n;
        while(n>0)
        {
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        if(t%(s+p)==0)
        return true;
        else return false;
    }
}