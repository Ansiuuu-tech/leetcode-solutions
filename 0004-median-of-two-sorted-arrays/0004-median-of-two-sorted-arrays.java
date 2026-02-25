class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;;
        double arr[]=new double[m+n];
        for(int i=0;i<arr.length;i++)
        {
            if(i<nums1.length)
            arr[i]=nums1[i];
            else
            arr[i]=nums2[i-nums1.length];
        }
    Arrays.sort(arr);
    if(arr.length%2==0)
    return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
    
    else
    return arr[arr.length/2];
}
}