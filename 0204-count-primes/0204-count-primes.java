class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1)
        return 0;
        else{
        int c=sieve(n);
        return c;}
    }

   public  int sieve(int n){
    boolean arr[]=new boolean[n+1];
    Arrays.fill(arr,true);
    arr[0]=false;
    arr[1]=false;
    for(int i=2;i*i<=n;i++)
    { if(arr[i]==true){
    
        for(int j=i*i;j<=n;j+=i)
        {
            arr[j]=false;
        }
    }
    }
    int count=0;
    for(int i=2;i<n;i++)
    {
        if(arr[i]==true)
        count+=1;
    }
    return count;
    }
}