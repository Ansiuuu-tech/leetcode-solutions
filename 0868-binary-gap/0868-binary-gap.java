class Solution {
    public int binaryGap(int n) {
        String bin=Integer.toBinaryString(n);
        int Maxc=0,p=-1;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            { 
                 if(p!=-1)
                    Maxc=Math.max(Maxc,i-p);
                   p=i;
                }
         
          
        }
       
        return Maxc;
    }
}