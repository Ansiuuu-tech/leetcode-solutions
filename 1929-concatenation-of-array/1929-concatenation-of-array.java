class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        for(int i=0;i<arr.length;i++)
        {
            if(i>=nums.length){
                arr[i]=nums[i-nums.length];
            }
            else
            arr[i]=nums[i];
        }
        return arr;
    }
}