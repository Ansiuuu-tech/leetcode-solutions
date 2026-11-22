class Solution {
    public boolean checkString(String s) {
         int b=0;
        for(int i=s.length()-1;i>=0;i--)
        {
           
            if(s.charAt(i)=='a')
            {
                b=1;
               
            }
            if(s.charAt(i)=='b'&& b==1 )
            return false;
        }
        return true;
    }
}