class Solution {
    public int minimumPushes(String word) {
        int arr[]= new int[26];

        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }

        int min=0;
        Arrays.sort(arr);
        for(int i=25,pc=0;i>=0;i--){
            int ci=25-i;
            if(ci%8==0)
                pc++;
            min+=arr[i] *pc;
        }
        return min;
    }
}