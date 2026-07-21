class Solution {
    public long gcdSum(int[] nums) {
       int arr[]=new int[nums.length];
        int max=0;
       for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcd(max,nums[i]);
       } 
       Arrays.sort(arr);
       int i=0,j=nums.length-1;
       long sum=0;

       while(i<j){
        sum+=gcd(arr[i],arr[j]);
        i++;
        j--;
       }
       return sum;
    }
    public int gcd(int a ,int b){
        while(a!=0)
        {
            int t=a;
            a=b%a;
            b=t;
        }
        return b;
    }
}