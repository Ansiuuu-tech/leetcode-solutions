class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0;
        int j=0;
        for(int i=0; i<nums1.length; i++){
            int val = nums1[i];
            if(j<i)
            {
            j=i+1;
            }
            while(j<nums2.length && nums2[j]>=nums1[i]){
                j++;
            }
            max=Math.max(max,j-i-1);
        }
        return max;
    }
}