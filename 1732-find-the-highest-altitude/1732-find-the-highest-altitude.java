class Solution {
    public int largestAltitude(int[] gain) {
        int ps=0;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
            gain[i]+=ps;
            ps=gain[i];
            max=Math.max(gain[i],max);
        }
        return max;

    }
}