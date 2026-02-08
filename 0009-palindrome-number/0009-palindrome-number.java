class Solution {
    public boolean isPalindrome(int x) {
        int t=x,s=0;
        while(x>0)
        {
            int r=x%10;
            x=x/10;
            s=s*10+r;
        }
        if(s==t)
        return true;
        else
        return false;
    }
}