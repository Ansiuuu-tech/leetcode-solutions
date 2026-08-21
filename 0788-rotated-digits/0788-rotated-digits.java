class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            boolean f1=true,f2=false;
            int temp=i;
            while(temp>0)
            {
                int t=temp%10;
                temp/=10;
                if(t==3||t==4||t==7)
                f1=false;
                if(t==2||t==5||t==6||t==9)
                f2=true;
            }
            if(f1&&f2)
            c++;
            
        }

        return c;
    }
}