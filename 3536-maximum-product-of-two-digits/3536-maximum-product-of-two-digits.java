class Solution {
    public int maxProduct(int n) {
        String str=Integer.toString(n);
        int l=str.length();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            arr[i]=ch-48;
        }
        Arrays.sort(arr);
        return (arr[l-1]*arr[l-2]);
    }
}