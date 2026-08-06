class Solution {
    public int smallestNumber(int n, int t) {
        int p;
        while(n<=100){
            if(n<10)
            p=n%10;
            else
         p=(n%10)*(n/10);
        if(p%t==0)
        return n;
        n+=1;
        }
    
    return -1;
    }
}