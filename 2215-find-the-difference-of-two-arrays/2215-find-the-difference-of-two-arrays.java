class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        hs1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
        hs2.add(nums2[i]);

    ArrayList<Integer> ls1=new ArrayList<>();
        ArrayList<Integer> ls2=new ArrayList<>();
        for(int nums: hs1)
        {
            if(!hs2.contains(nums))
            ls1.add(nums);
        }
        for(int nums: hs2)
        {
            if(!hs1.contains(nums))
            ls2.add(nums);
        }

        return Arrays.asList(ls1,ls2);

    }
}