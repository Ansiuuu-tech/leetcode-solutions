class Solution {
    public int maxCoins(int[] arr) {
        Arrays.sort(arr);
        int c=arr.length/3;
        int sum=0;
        int k=0;
        int ind=arr.length-2;
        while(k<c)
        {
            sum+=arr[ind];
            ind-=2;
            k++;
        }
        return sum;
    }
}