class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i+k<=s.length();i++)
        {
            hs.add(s.substring(i,i+k));
        }

       return hs.size()==(int)Math.pow(2,k);
    }
}