class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String nstr="";
        for(int i=0;i<n;i++)
        {
             int st=i,en=i;
             while((st>=0&&en<n)&& s.charAt(st)==s.charAt(en))
             {
            
                st--;
                en++;
             }
             String temp=s.substring(st+1,en);
             if(temp.length()>nstr.length())
             nstr=temp;

              st=i;
              en=i+1;
             while((st>=0&&en<n)&& s.charAt(st)==s.charAt(en))
             {
            
                st--;
                en++;
             }
              temp=s.substring(st+1,en);
             if(temp.length()>nstr.length())
             nstr=temp;

    }
    return nstr;

}
}