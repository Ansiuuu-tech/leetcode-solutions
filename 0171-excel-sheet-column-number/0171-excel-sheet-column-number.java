class Solution {
    public int titleToNumber(String str) {
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            res=res*26+(ch-'A'+1);
        }
        return res;
    }
}