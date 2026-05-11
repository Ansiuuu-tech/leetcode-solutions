class Solution {
    public int[] separateDigits(int[] nums) {
     
        List<Integer> ls=new ArrayList<>();
        for(int num:nums)
        {
            String s=Integer.toString(num);
            for(int i=0;i<s.length();i++)
            ls.add(s.charAt(i)-'0');
        }
        int arr[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++)
        {
            arr[i]=ls.get(i);
        }
        return arr;
    }
}