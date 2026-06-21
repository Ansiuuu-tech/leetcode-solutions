class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
       int p=0;
       for(int i=0;i<costs.length;i++)
       {
        if(costs[i]<=coins){
        coins-=costs[i];
        p++;
        }
       } 
       return p;
    }
}