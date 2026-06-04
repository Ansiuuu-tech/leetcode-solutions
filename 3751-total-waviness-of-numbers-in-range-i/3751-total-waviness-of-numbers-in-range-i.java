class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum=0;
        for(int i=num1;i<=num2;i++)
        {
            sum+=count(i);
        }
        return sum;
    }
    public int count(int n)
    {
        String str=Integer.toString(n);
        int c=0;
        for(int i=1;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if((ch>str.charAt(i-1)&& ch>str.charAt(i+1))||(ch<str.charAt(i-1)&& ch<str.charAt(i+1)))
            c++;
        }
        return c;
    }
}