class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character , Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            mp.put(ch,i);
        }

        ArrayList<Integer> ls=new ArrayList<>();
        int pr=-1;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            max=Math.max(max,mp.get(ch));
            if(max==i)
            {
                ls.add(max-pr);
                pr=max;
            }
        }
        return ls;
    }
}