class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] alp=s.substring(0,n/2).toCharArray();
        Arrays.sort(alp);
        String res = new String(alp)+((n%2==1)?s.charAt(n / 2):"")+new StringBuilder(new String(alp)).reverse();
         return res;
    }
}