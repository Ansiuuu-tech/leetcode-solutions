class Solution {
    public long sumAndMultiply(int n) {
        String str=Integer.toString(n);
        long x=0,s=0;

        for(char ch: str.toCharArray())
        {
            if(ch!='0')
                x=x*10+ch-'0';
                s+=ch-'0';
        }
        return x*s;
    }
}