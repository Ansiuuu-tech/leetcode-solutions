class Solution {
    public int romanToInt(String s) {
        int l=s.length();
    Map<Character,Integer> map=Map.of( 'I' , 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000);
            int ans=0,n;
        for(int i=0;i<l;i++)
        {
           int c=map.get(s.charAt(i));
           if(i+1<l)
            n=map.get(s.charAt(i+1));
           else
           n=0;
           if(c<n)
           ans-=c;
           else
           ans+=c;
        }

        return ans;
    }
}