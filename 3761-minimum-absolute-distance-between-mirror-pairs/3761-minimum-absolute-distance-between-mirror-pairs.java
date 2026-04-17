class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans=100000,i=0;
        HashMap<Integer,Integer> hs=new HashMap<>();

        for(int num: nums)
        {
            if(hs.containsKey(num))
            ans=Math.min(ans,i-hs.get(num));

                int r=0;
                while(num>0)
                {
                    r=r*10+(num%10);
                    num/=10;
                }
                hs.put(r,i++);
              

        }

        if(ans==100000)
        return -1;
        else
        return ans;
    }
}