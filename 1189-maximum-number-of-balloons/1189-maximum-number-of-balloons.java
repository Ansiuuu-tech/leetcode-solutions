class Solution {
    public int maxNumberOfBalloons(String text) {
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch=='b')
            c1+=2;
            else if(ch=='a')
            c2+=2;
            else if(ch=='l')
            c3++;
            else if(ch=='o')
            c4++;
            else if(ch=='n')
            c5+=2;

        }
        int min=Math.min(c1,Math.min(c2,Math.min(c3,Math.min(c4,c5))));
        return min/2;
    }
}