class Solution {
    public int minOperations(String s) {
        int l=s.length();
        int c=0,d=0;
        
        for(int i=0;i<l;i++)
        {
          if(i%2==0)
          {
            if(s.charAt(i)!='1')
            c++;
          } 
          else
          {
            if(s.charAt(i)!='0')
            c++;
          }
         }
     
            for(int i=0;i<l;i++)
        {
          if(i%2==0)
          {
            if(s.charAt(i)!='0')
            d++;
          } 
          else
          {
            if(s.charAt(i)!='1')
            d++;
          }
        }
        return (int)Math.min(c,d);
     
    }
    
}