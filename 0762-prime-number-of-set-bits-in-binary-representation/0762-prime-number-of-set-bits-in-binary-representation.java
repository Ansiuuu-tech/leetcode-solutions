class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(2);
         hs.add(3);
          hs.add(5);
           hs.add(7);
            hs.add(11);
             hs.add(13);
              hs.add(17);
               hs.add(19);
                int ans=0;
               for(int i=left;i<=right;i++)
               {
                int c=Integer.bitCount(i);
                if(hs.contains(c))
                ans++;

               }
               return  ans;

    }
}