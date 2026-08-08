class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low=0,high=arr.length;
        int c=0,sum=0;
            for(int i=0;i<k;i++)
            {
            sum+=arr[i];
            }
            if(sum/k>=threshold)
            c=1;
        while(low+k<high)
        {
           sum+=arr[low+k];
           sum-=arr[low];
           if(sum/k>=threshold)
           c++;
           low++;
        }
        return c;
    }
}