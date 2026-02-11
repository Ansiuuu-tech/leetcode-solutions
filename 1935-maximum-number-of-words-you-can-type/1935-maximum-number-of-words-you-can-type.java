class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String t=text+" ";
        String temp="";
        int c=0;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==' ')
            {
                int j;
                for( j=0;j<temp.length();j++)
                {
                    if(brokenLetters.indexOf(temp.charAt(j))>=0)
                    {
                break;
                    }
                }
                if(j==temp.length())
                c++;
                temp="";
            }
            else
            {
                temp+=t.charAt(i);
            }
        }
        return c;
    }
}