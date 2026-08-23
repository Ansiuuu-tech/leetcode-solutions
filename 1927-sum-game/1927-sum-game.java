class Solution {
    public boolean sumGame(String num) {
        int q1=0,q2=0;
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++)
        {
            if(i<num.length()/2)
             if(num.charAt(i)=='?')
               q1++;
               else
               s1+=(num.charAt(i)-'0');
            else
             if(num.charAt(i)=='?')
               q2++;
               else
               s2+=(num.charAt(i)-'0');
        }
        if((q1+q2)%2==1)
        return true;

        int diff=s1-s2;
        int tg=(q2-q1)/2*9;

        if(diff==tg)
        return false;
        else return true;

    }
}