class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int res=0,max=0;
        for(int n: nums)
        {
            hs.put(n,1+hs.getOrDefault(n,0));
            if(hs.get(n)>max)
            {
                res=n;
                max=hs.get(n);
            }
        }
        return res;
    }
}