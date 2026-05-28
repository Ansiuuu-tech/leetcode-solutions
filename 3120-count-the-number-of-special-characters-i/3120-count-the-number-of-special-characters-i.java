class Solution {
    public int numberOfSpecialChars(String word) {
        int upp[]=new int[26];
        int low[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch>='a'&&ch<='z')
                low[ch-'a']=1;
                else if(ch>='A'&&ch<='Z')
                upp[ch-'A']=1;
        }
        int c=0;
        for(int i=0;i<26;i++)
        if(upp[i]==1&&low[i]==1)
        c++;
       
        return c;
    }
}