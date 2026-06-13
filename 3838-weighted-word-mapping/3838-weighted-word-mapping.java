class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            int sum=0;
            for(int j=0;j<word.length();j++)
            {
                int x=word.charAt(j)-'a';
                sum+=weights[x];
            }
            int mod=sum%26;
            char ch=(char)('z'- mod);
           res.append(ch);
        }
        return res.toString();
    }
}