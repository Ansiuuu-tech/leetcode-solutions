class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ls.add(nums[i]);
        }
        int i=1;
        while(true){
             int m=k*i;
            if(!ls.contains(m))
            return m;
           
            i++;
        }
      
    }
}