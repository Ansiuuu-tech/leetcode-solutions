class Solution {
    public int nthUglyNumber(int n) {
        int ugly[]=new int[n];
        ugly[0]=1;
    int i1=0,i2=0,i3=0;
    for(int i=1;i<n;i++)
    {
        int next1=ugly[i1]*2;
        int next2=ugly[i2]*3;
        int next3=ugly[i3]*5;

        int min=Math.min(next1,Math.min(next2,next3));
        ugly[i]=min;

        if(min==next1)
        i1++;
         if(min==next2)
        i2++;
         if(min==next3)
        i3++;
    }
    return ugly[n-1];
    }
}
    