class Solution {
    public int maxVowels(String s, int k) {
    char arr[]=s.toCharArray();
    int c=0,maxc;
    int left=0;
    for(int i=0;i<k;i++)
    { boolean x=isvowel(arr[i]);
        if(x)
        c++;}
    
    maxc=c;
    for(int i=k;i<arr.length;i++)
    {
         boolean co=isvowel(arr[left]);
         if(co)
         c--;
         co=isvowel(arr[i]);

        if(co)
        c++;
        maxc=Math.max(c,maxc);
        if(maxc==k)
        return k;
        left++;
        
    }
    return maxc;

    }
    boolean isvowel(char ch)
    {
        String vowel="AEIOUaeiou";
        return vowel.indexOf(ch)!=-1;
    }
}