class Solution {
    private boolean helper(String s1,String s2){
        int arr[]=new int[26];
        for(char ch:s1.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            if(arr[ch-'a']!=0)
            return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int ans=0;
        int m=words.length;
        for(int i=0;i<m;i++){

            for(int j=i+1;j<m;j++){

                if(helper(words[i],words[j])){
    
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}