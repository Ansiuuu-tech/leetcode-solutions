class Solution {
    public String findDifferentBinaryString(String[] nums) {

        int n= nums.length;
        int s=(int)Math.pow(2, n);

        int[] arr= new int[s];

        for(String num:nums){
            int val=Integer.parseInt(num,2);
            arr[val]++;
        }
        String res="";
        for(int i=0;i<s;i++){
            if(arr[i]==0){
                String ans=Integer.toBinaryString(i);
                for(int k=0;k<n - ans.length();k++)
                res=res+"0";
                return res+ans;
            }
        }
        for(int i=0;i<n;i++)
        res=res+"0";
        return res;
    }
}