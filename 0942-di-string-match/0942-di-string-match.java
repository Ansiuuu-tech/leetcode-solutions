class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] r=new int[n+1];
        int low=0,high=n;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                r[i] = low++;
            } else {
                r[i] = high--;
            }
        }
        r[n] = low;
        return r;
    }
}