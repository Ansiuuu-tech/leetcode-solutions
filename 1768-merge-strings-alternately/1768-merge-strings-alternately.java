class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged="";
        int n1=word1.length();
        int n2=word2.length();
        int n=Math.min(n1,n2);
        for(int i=0;i<n;i++)
        {
            merged+=word1.charAt(i);
            merged+=(word2.charAt(i));
        }
       
   if(n1>n2)
   {
    merged+=(word1.substring(n,n1));
   }
   else{
    merged+=(word2.substring(n,n2));
   }
return merged;
    }
}