class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String w:strs)
        {
            char[] ch= w.toCharArray();
            Arrays.sort(ch);
            String sw = new String(ch);
            if (!map.containsKey(sw))
            {
                map.put(sw,new ArrayList<>());
            }
            
            map.get(sw).add(w);
        }
        
        return new ArrayList<>(map.values());
    }
}