class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     
        for(int i=0;i<flowerbed.length&&n>0;i++)
        { 
           if(flowerbed[i]==0)
           {
            int pr=(i==0)?0:flowerbed[i-1];
              int ne=(i==flowerbed.length-1)?0:flowerbed[i+1];
          if(pr==0&&ne==0)
          {
            flowerbed[i]=1;
          n--;
          }
                
            }
        }
        return n==0;
    }
}