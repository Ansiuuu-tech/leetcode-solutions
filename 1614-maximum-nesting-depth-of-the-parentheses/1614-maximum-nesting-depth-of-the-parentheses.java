class Solution {
    public int maxDepth(String s) {
        int l=s.length();
        int m=0,c=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='(')
            c++;
            if(s.charAt(i)==')')
            c--;
            if(c>m)
            m=c;
        }
        return m;
    }
}