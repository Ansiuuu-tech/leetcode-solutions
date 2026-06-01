class Solution {
    public int minimumCost(int[] cost) {
      Arrays.sort(cost);
      int c=0,co=0;
      for(int i=cost.length-1;i>=0;i--)
      {
        co++;
        if(co%3==0)
        continue;
        c+=cost[i];
      }
      return c;
    }
}