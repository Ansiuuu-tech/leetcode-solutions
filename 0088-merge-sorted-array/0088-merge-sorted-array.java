class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int arr[]=new int[m+n];
        for(int i=0;i<(m+n);i++)
        {
            if(i<m)
            nums1[i]=nums1[i];
            else
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}