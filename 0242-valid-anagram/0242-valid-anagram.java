class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> ls=new ArrayList<>();
         if(s.length()==t.length()){
        for(int i=0;i<s.length();i++)
        {
            ls.add(s.charAt(i));
        }
               
         for(int i=0;i<t.length();i++)
        {
            if(ls.contains(t.charAt(i)))
            {
        ls.remove(Character.valueOf(t.charAt(i)));            }
        }
        if(ls.size()!=0)
        return false;
        else return true;
        
    }
    return false;
    }

}