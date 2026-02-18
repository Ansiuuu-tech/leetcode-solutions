class Solution {
    public boolean closeStrings(String word1, String word2) {
       
        if(word1.length()==word2.length())
        {
            HashMap<Character,Integer> map1=new HashMap();
            HashMap<Character,Integer> map2=new HashMap();
            for(char ch: word1.toCharArray())
            {
                if(map1.containsKey(ch))
                {
                    map1.put(ch,map1.get(ch)+1);
                }
                else{
                    map1.put(ch,1);
                }
            }
             for(char ch: word2.toCharArray())
            {
                if(map2.containsKey(ch))
                {
                    map2.put(ch,map2.get(ch)+1);
                }
                else{
                    map2.put(ch,1);
                }
            }
           if (!map1.keySet().equals(map2.keySet())) {
                return false;
                }
            List<Integer> f1=new ArrayList<>(map1.values());
            List<Integer> f2=new ArrayList<>(map2.values());
            Collections.sort(f1);
            Collections.sort(f2);
            return f1.equals(f2);
            
        }
        else{
            return false;
        }
    }
}